package kr.co.pension.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.pension.dao.MemberDAO;
import kr.co.pension.dto.MemberDTO;

@Controller
public class MemberController {

	@Autowired
	private SqlSession sql;
	
	// 아래의 두개의 매핑은 독립시켜서 다른 컨트롤러에 담아도 된다.
	@RequestMapping("/")
	public String home() {
		return "redirect:/main/index";
	}
	
	@RequestMapping("/main/index")
	public String index() {
		return "/main/index";
	}
	
	
	@RequestMapping("/member/member")
	public String member() {
		return "/member/member";
	}
	
	@RequestMapping("/member/useridChk")
	public @ResponseBody String useridChk(HttpServletRequest request) {
		MemberDAO mdao=sql.getMapper(MemberDAO.class);
		String userid=request.getParameter("userid");
		
		return mdao.useridChk(userid);
	}
	
	@RequestMapping("/member/memberOk")
	public String memberOk(MemberDTO mdto) {
		MemberDAO mdao=sql.getMapper(MemberDAO.class);
		mdao.memberOk(mdto);
		
		return "redirect:/member/login";
	}
	
	@RequestMapping("member/loginOk")
	public String loginOk(MemberDTO mdto,HttpSession session) {
		MemberDAO mdao=sql.getMapper(MemberDAO.class);
		
		if(mdao.loginOk(mdto)==1) {
			session.setAttribute("userid", mdto.getUserid());
			return "redirect:/main/index";
		} else {
			return "redirect:/member/login?err=1";
		}	
	}
	
	@RequestMapping("/member/login")
	public String login(HttpServletRequest request,Model model) {
		String err=request.getParameter("err");
		model.addAttribute("err",err);
		return "/member/login";
	}
	
	@RequestMapping("/member/logout")
	public String logout(HttpSession session) {
		session.invalidate();		
		return "redirect:/main/index";
	}
}
