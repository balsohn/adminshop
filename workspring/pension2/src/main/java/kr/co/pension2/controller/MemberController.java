package kr.co.pension2.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	private SqlSession sql;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:main/index";
	}
	
	@RequestMapping("/main/index")
	public String index() {
		return "/main/index";
	}
}
