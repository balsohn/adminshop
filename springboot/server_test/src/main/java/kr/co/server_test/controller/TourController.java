package kr.co.server_test.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.server_test.dto.TourDTO;
import kr.co.server_test.mapper.TourMapper;

@Controller
public class TourController {

	@Autowired
	TourMapper mapper;
	
	@RequestMapping("/tour/write")
	public String write() {
		return "/tour/write";
	}
	
	@RequestMapping("/tour/writeOk")
	public String writeOk(MultipartHttpServletRequest request,TourDTO tdto) throws Exception {
		MultipartFile file=request.getFile("file");
		String uploadpath=request.getServletContext().getRealPath("uploads");
		Path realpath=Paths.get(uploadpath);
		
		if(Files.notExists(realpath)) {
			Files.createDirectories(realpath);
		}
		
		if(!file.isEmpty()) {
			String fname=file.getOriginalFilename();
			Path save=Paths.get(uploadpath,fname);
			
			if(Files.exists(realpath)) {
				fname=System.currentTimeMillis()%1000+"_"+fname;
				save=Paths.get(uploadpath,fname);
			}
			
			Files.copy(file.getInputStream(), save,StandardCopyOption.REPLACE_EXISTING);
			tdto.setFname(fname);
		}
		
		mapper.writeOk(tdto);
		
		return "redirect:/tour/list";
	}
	
	@RequestMapping("/tour/list")
	public String list(Model model,HttpServletRequest request) {
		int page=request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
		int index=(page-1)*10;
		int p=(page-1)/10;
		int pstart=p*10+1;
		int pend=pstart+9;
		int chong=mapper.getChong();
		if(pend>chong) {
			pend=chong;
		}
		System.out.println(pstart);
		System.out.println(pend);
		ArrayList<TourDTO> tlist=mapper.list(index);
		
		model.addAttribute("page",page);
		model.addAttribute("pstart", pstart);
		model.addAttribute("pend",pend);
		model.addAttribute("chong", chong);
		model.addAttribute("tlist",tlist);
		
		return "/tour/list";
	}
	
	@RequestMapping("/tour/content")
	public String content(Model model,HttpServletRequest request) {
		String id=request.getParameter("id");
		model.addAttribute("tdto", mapper.content(id));
		return "/tour/content";
	}
	
	@RequestMapping("/tour/delete")
	public String delete(HttpServletRequest request) {
		String id=request.getParameter("id");
		mapper.delete(id);
		
		return "redirect:/tour/list";
	}
	
	@RequestMapping("/tour/update")
	public String update(HttpServletRequest request,Model model) {
		String id=request.getParameter("id");
		model.addAttribute("tdto", mapper.content(id));
		
		return "/tour/update";
	}
	
	@RequestMapping("/tour/updateOk")
	public String updateOk(TourDTO tdto,MultipartHttpServletRequest request) throws Exception {
		MultipartFile file=request.getFile("file");
		
		if(file.isEmpty()) {
			String fname=mapper.getFname(tdto.getId());
			tdto.setFname(fname);
		} else {
			String fname=file.getOriginalFilename();
			String uploadpath=request.getServletContext().getRealPath("uploads");
			Path path=Paths.get(uploadpath,fname);
			if(Files.exists(path)) {
				Files.delete(path);
			}
			
			path=Paths.get(uploadpath,fname);
			Files.copy(file.getInputStream(), path,StandardCopyOption.REPLACE_EXISTING);
			tdto.setFname(fname);
		}
		mapper.updateOk(tdto);
		return "redirect:/tour/content?id="+tdto.getId();
	}
}
