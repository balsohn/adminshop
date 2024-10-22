package kr.co.member;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

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
		return "redirect:index";
	}
	
	@RequestMapping("index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("member")
	public String member() {
		return "member";
	}
	
	@RequestMapping("memberOk")
	public String memberOk(MemberDTO mdto) {
		MemberDAO mdao=sql.getMapper(MemberDAO.class);
		mdao.MemberOk(mdto);
		
		return "redirect:login";
	}
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("loginOk")
	public String loginOk(MemberDTO mdto,HttpSession session) {
		MemberDAO mdao=sql.getMapper(MemberDAO.class);
		
		if(mdao.loginOk(mdto)) {
			session.setAttribute(mdto.getUserid(), "userid");
			return "redirect:index";
		} else {
			return "redirect:login?err=1";
		}
	}
	
	
}
