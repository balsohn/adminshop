package com.example.demo.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;


public class BoardController {

	@Autowired
	private BoardMapper mapper;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:list";
	}
	
	@RequestMapping("list")
	public String list(Model model, HttpServletRequest request) {
		int page=request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
		int pageSize=request.getParameter("pageSize")==null?10:Integer.parseInt(request.getParameter("pageSize"));
		String stype=request.getParameter("stype");
		if(stype==null) {
			stype="name";
		}
		String sword=request.getParameter("sword")==null?"":request.getParameter("sword");
		int index=(page-1)*10;
		int p=(page-1)/10;
		int pstart=p*10+1;
		int pend=pstart+9;
		int chong=mapper.getChong(pageSize,stype,sword);
		if(chong<pend) {
			pend=chong;
		}
		
		model.addAttribute("sword",sword);
		model.addAttribute("stype",stype);
		model.addAttribute("pageSize",pageSize);
		model.addAttribute("page",page);
		model.addAttribute("pstart",pstart);
		model.addAttribute("pend",pend);
		model.addAttribute("chong",chong);
		model.addAttribute("blist",mapper.list(index,pageSize,stype,sword));
		return "list";
	}
	
	@RequestMapping("readnum")
	public String readnum(HttpServletRequest request) {
		String id=request.getParameter("id");
		mapper.readnum(id);
		return "redirect:content?id="+id;
	}
	
	@RequestMapping("content")
	public String content(Model model,HttpServletRequest request) {
		String id=request.getParameter("id");
		model.addAttribute("bdto",mapper.content(id));
		return "content";
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request) {
		String id=request.getParameter("id");
		mapper.delete(id);
		return "redirect:list";
	}
	
	@RequestMapping("update")
	public String update(HttpServletRequest request,Model model) {
		String id=request.getParameter("id");
		model.addAttribute("bdto",mapper.content(id));
		return "update";
	}
	
	@RequestMapping("updateOk")
	public String updateOk(BoardDTO bdto) {
		mapper.updateOk(bdto);
		return "redirect:content?id="+bdto.getId();
	}
	
	@RequestMapping("isPwd")
	public String isPwd(HttpServletRequest request) {
		String type=request.getParameter("type");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		if(mapper.isPwd(id, pwd)) {
			if(type.equals("1")) {
				return "redirect:update?id="+id;
			} else {
				return "redirect:delete?id="+id;
			}
		} else {
			return "redirect:content?err=1&id="+id;
		}
	}
}
