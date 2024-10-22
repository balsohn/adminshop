package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class MemberController {

	@Autowired
	private MemberDAO mdao;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list",mdao.list());
		
		return "/list";
	}
	
	@RequestMapping("writedOk")
	public String writeOk() {
		mdao.writeOk(null)
	}
}
