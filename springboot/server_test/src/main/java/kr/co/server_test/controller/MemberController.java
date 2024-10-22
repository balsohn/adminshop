package kr.co.server_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import kr.co.server_test.dto.MemberDTO;
import kr.co.server_test.mapper.MemberMapper;

@Controller
public class MemberController {

	@Autowired
	private MemberMapper mapper; 
	
	@RequestMapping("/")
	public String home() {
		return "redirect:main";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "/main";
	}
	
	@RequestMapping("/member")
	public String member() {
		return "/member";
	}
	
	@RequestMapping("/useridChk")
	public @ResponseBody int useridChk(HttpServletRequest request) {
		String userid=request.getParameter("userid");
		return mapper.useridChk(userid);
	}
	
	@RequestMapping("/memberOk")
	public String memberOk(MemberDTO mdto) {
		mapper.memberOk(mdto);
		return "redirect:/main";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "/login";
	}
	
	@RequestMapping("/loginOk")
	public String loginOk(MemberDTO mdto,HttpSession session) {
		if(mapper.loginOk(mdto.getUserid(),mdto.getPwd())) {
			session.setAttribute("userid", mdto.getUserid());
			return "redirect:/main";
		} else {
			return "redirect:login?err=1";
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/main";
	}
}
