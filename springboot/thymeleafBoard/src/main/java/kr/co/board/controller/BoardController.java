package kr.co.board.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.board.dto.BoardDTO;
import kr.co.board.mapper.BoardMapper;

@Controller
public class BoardController {

	@Autowired
	private BoardMapper mapper;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model) {
		int page=request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
		int index=(page-1)*10;
		int p=(page-1)/10;
		int pstart=p*10+1;
		int pend=pstart+9;
		int chong=mapper.getChong();
		if(pend> chong) {
			pend=chong;
		}
		
		ArrayList<BoardDTO> list=mapper.list(index);
		model.addAttribute("list",list);
		model.addAttribute("page",page);
		model.addAttribute("pstart",pstart);
		model.addAttribute("pend",pend);
		model.addAttribute("chong",chong);
		
		
		return "/list";
	}
	
	@RequestMapping("/readnum")
	public String readnum(HttpServletRequest request) {
		String id=request.getParameter("id");
		mapper.readnum(id);
		
		return "redirect:/content?id="+id;
	}
	
	@RequestMapping("/content")
	public String content(HttpServletRequest request, Model model) {
		String id=request.getParameter("id");
		model.addAttribute("bdto",mapper.content(id));
		return "/content";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		String id=request.getParameter("id");
		mapper.delete(id);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/write")
	public String write() {
		return "/write";
	}
	
	@RequestMapping("/writeOk")
	public String writeOk(BoardDTO bdto) {
		mapper.writeOk(bdto);
		return "redirect:/list";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request,Model model) {
		String id=request.getParameter("id");
		model.addAttribute("bdto",mapper.content(id));
		
		return "/update";
	}
	
	@RequestMapping("/updateOk")
	public String updateOk(BoardDTO bdto) {
		mapper.updateOk(bdto);
		return "redirect:content?id="+bdto.getId();
	}
}
