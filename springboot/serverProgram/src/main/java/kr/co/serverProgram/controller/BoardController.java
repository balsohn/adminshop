package kr.co.serverProgram.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.serverProgram.dto.BoardDTO;
import kr.co.serverProgram.mapper.BoardMapper;

@Controller
public class BoardController {

	@Autowired
	private BoardMapper mapper;
	
	@RequestMapping("/readnum")
	public String readnum(HttpServletRequest request) {
		String id=request.getParameter("id");
		mapper.readnum(id);
	
		return "redirect:/content?id="+id;
	}
	
	@RequestMapping("/content")
	public String content(HttpServletRequest request, Model model) {
		String id=request.getParameter("id");
		model.addAttribute("bdto", mapper.content(id));
		return "/content";
	}
	
	@RequestMapping("/write")
	public String write() {
		return "/write";
	}
	
	@RequestMapping("/writeOk")
	public String writeOk(BoardDTO bdto,MultipartHttpServletRequest request) throws Exception {
		MultipartFile file=request.getFile("file");
		String uploadPath=request.getServletContext().getRealPath("/uploads");
		Path path=Paths.get(uploadPath);
		if(Files.notExists(path)) {
			Files.createDirectories(path);
		}
		
		if(!file.isEmpty()) {
			String fname=System.currentTimeMillis()%10000+"_"+file.getOriginalFilename();
			path=Paths.get(uploadPath,fname);
			Files.copy(file.getInputStream(), path,StandardCopyOption.REPLACE_EXISTING);
			
			bdto.setFname(fname);
		}
		mapper.writeOk(bdto);
		
		return "redirect:/index";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) throws Exception {
		String id=request.getParameter("id");
		BoardDTO bdto=mapper.content(id);
		String path=request.getServletContext().getRealPath("/uploads");
		Path realPath=Paths.get(path,bdto.getFname());
		if(Files.exists(realPath)) {
			Files.delete(realPath);
		}
		mapper.delete(id);
		
		return "redirect:/index";				
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request, Model model) {
		String id=request.getParameter("id");
		BoardDTO bdto=mapper.content(id);
		
		model.addAttribute("bdto", bdto);
		return "/update";
	}
	
	@RequestMapping("/updateOk")
	public String updateOk(BoardDTO bdto, MultipartHttpServletRequest request) throws Exception {
		MultipartFile file=request.getFile("file");
		
		String id=request.getParameter("id");
		BoardDTO bdto2=mapper.content(id);
		String fname=bdto2.getFname();
		
		if(file.isEmpty()) {
			bdto.setFname(fname);
		} else {
			String uploadPath=request.getServletContext().getRealPath("/uploads");
			Path path=Paths.get(uploadPath,fname);
			if(Files.exists(path)) {
				Files.delete(path);
			}
			
			fname=System.currentTimeMillis()%10000+"_"+file.getOriginalFilename();
			path=Paths.get(uploadPath,fname);
			
			Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			bdto.setFname(fname);
		}
		
		mapper.updateOk(bdto);
		
		return "redirect:/content?id="+bdto.getId();
	}
}
