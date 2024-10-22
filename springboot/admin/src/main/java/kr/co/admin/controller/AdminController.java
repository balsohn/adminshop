package kr.co.admin.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.admin.dto.DaeDTO;
import kr.co.admin.dto.JungDTO;
import kr.co.admin.dto.ProQnaDTO;
import kr.co.admin.dto.ProductDTO;
import kr.co.admin.dto.SoDTO;
import kr.co.admin.mapper.AdminMapper;

@Controller
public class AdminController {

	@Autowired
	private AdminMapper mapper;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/product/productAdd";
	}
	
	@RequestMapping("/product/productAdd")
	public String productAdd(Model model) {
		model.addAttribute("daeAll",mapper.getDae());
		model.addAttribute("companyAll",mapper.getCompany());
		return "/product/productAdd";
	}
	
	@RequestMapping("/product/getJung")
	public @ResponseBody ArrayList<JungDTO> getJung(HttpServletRequest request) {
		String daecode=request.getParameter("daecode");
		return mapper.getJung(daecode);
	}
	
	@RequestMapping("/product/getSo")
	public @ResponseBody ArrayList<SoDTO> getSo(HttpServletRequest request) {
		String daejung=request.getParameter("daejung");
		System.out.println(daejung);
		return mapper.getSo(daejung);
	}
	
	@RequestMapping("/product/getPcode")
	public @ResponseBody String getPcode(HttpServletRequest requset) {
		String pcode=requset.getParameter("pcode");
		int num=mapper.getPcode(pcode);
		pcode=pcode+String.format("%03d", num);
		System.out.println(pcode);
		return pcode;
	}

 	@RequestMapping("product/productAddOk")
	public String productAddOk(MultipartHttpServletRequest multi,ProductDTO pdto) throws Exception {
		List<MultipartFile> files=multi.getFiles("dimg1");
		
		String uploadDirpath="resources/uploads";
		String realpath=multi.getServletContext().getRealPath(uploadDirpath);
		Path path=Paths.get(realpath);
		
		if(Files.notExists(path)) {
			Files.createDirectories(path);
		}
		
		String dimg="";		
		for(MultipartFile file:files) {
			if(!file.isEmpty()) {
				String oridimg1=file.getOriginalFilename();
				int index=oridimg1.lastIndexOf(".");
				String front=oridimg1.substring(0,index);
				String back=oridimg1.substring(index);
				String fdimg1=front+"_"+System.currentTimeMillis()%10000+back;
				
				Path save=Paths.get(realpath,fdimg1);
				Files.copy(file.getInputStream(), save, StandardCopyOption.REPLACE_EXISTING);
				
				dimg+=fdimg1+"/";
			}
		}
			
		files=multi.getFiles("pimg1");
		String pimg="";
		for(MultipartFile file:files) {
			if(!file.isEmpty()) {
				String orpimg1=file.getOriginalFilename();
				int index=orpimg1.indexOf(".");
				String front=orpimg1.substring(0,index);
				String back=orpimg1.substring(index);
				String fpimg=front+"_"+System.currentTimeMillis()%10000+back;
				
				Path save=Paths.get(realpath,fpimg);
				Files.copy(file.getInputStream(), save, StandardCopyOption.REPLACE_EXISTING);
				
				pimg+=fpimg+"/";
			}
		}
		pdto.setDimg(dimg);
		pdto.setPimg(pimg);
		mapper.productAddOk(pdto);
		return "redirect:productAdd";
	}
 	
	@RequestMapping("/gumae/gumaeAll")
	public String gumaeAll(Model model) {
		ArrayList<HashMap> mapAll=mapper.gumaeAll();
		for(HashMap map:mapAll) {
			String sts="";
			switch((int)map.get("state")) {
				case 0:sts="결제완료"; break;
				case 1:sts="상품준비중"; break;
				case 2:sts="배송중"; break;
				case 3:sts="배송완료"; break;
				case 4:sts="취소완료"; break;
				case 5:sts="반품"; break;
				case 6:sts="교환"; break;
			}
			map.put("stat", sts );
		}
		model.addAttribute("mapAll",mapAll);
		return "/gumae/gumaeAll";
	}
	
	@RequestMapping("/gumae/chgState")
	public String chgState(HttpServletRequest request) {
		String state=request.getParameter("state");
		String id=request.getParameter("id");	
		mapper.chgState(state,id);
		
		return "redirect:/gumae/gumaeAll";
	}
	
	@RequestMapping("/qna/qnaList")
	public String qnaList(Model model) {
		ArrayList<ProQnaDTO> qlist=mapper.qnaList();
		model.addAttribute("qlist",qlist);
		
		return "/qna/qnaList";
	}
	
	@RequestMapping("/qna/writeAnswerOk")
	public String writeAnswerOk(ProQnaDTO pdto) {
		pdto.setUserid("admin");
		mapper.writeAnswerOk(pdto);
		return "redirect:/qna/qnaList";
	}
 	
 	@RequestMapping("test")
 	public String test() {
 		return "test";
 	}
 	
}
