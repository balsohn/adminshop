	package kr.co.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String index(HttpSession session,Model model) {
		
		
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		
		if (session.getAttribute("userid") != null) {
			String name=mdao.getName(session.getAttribute("userid").toString());
	        model.addAttribute("name", name);
	    }
		
		return "index";
	}
	
	@RequestMapping("/member")
	public String member() {
		return "member";
	}
	
	/*
	@RequestMapping("/useridCheck")
	public void useridCheck(HttpServletResponse response,
			PrintWriter out) throws Exception {
		
		response.getWriter().append("하하하");
		out.print("hello");		
	}	*/
	
	@RequestMapping("/useridCheck")
	public @ResponseBody String useridCheck(String userid) {
		   // 리턴되는값이 값 그 자체
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		
		
		int chk=mdao.useridCheck(userid);
		
		return chk+"";
	}
	
	@RequestMapping("/memberOk")
	public String memberOk(MemberDTO mdto) {
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		mdao.memberOk(mdto);
		
		return "redirect:login";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/loginOk")
	public String loginOk(MemberDTO mdto,HttpSession session) {
		
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		if(mdao.loginOk(mdto)) {
			session.setAttribute("userid", mdto.getUserid());
			return "redirect:index";
		} 
		else {
			return "redirect:login?err=1";
		}
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		
		session.invalidate();

		return "redirect:index";
	}
	
	@RequestMapping("/memberView")
	public String memberView(HttpSession session,Model model,HttpServletRequest request) {
		
		String err=request.getParameter("err");
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		MemberDTO mdto=mdao.memberView(session.getAttribute("userid").toString());
		
		model.addAttribute("err",err);
		model.addAttribute("mdto",mdto);
		return "memberView";
	}
	
	@RequestMapping("/phoneOk")
	public String phoneOk(String phone,HttpSession session) {
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		mdao.phoneOk(phone,session.getAttribute("userid").toString());
		
		return "redirect:memberView";
	}
	
	@RequestMapping("/emailOk")
	public String emailOk(String email,HttpSession session) {
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		mdao.emailOk(email, session.getAttribute("userid").toString());
		
		return "redirect:memberView";
	}
	
	@RequestMapping("/pwdChgOk")
	public String pwdChkOk(HttpSession session,
			String oldPwd,String pwd,String pwd2) {
		
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		String oldpwd2=mdao.pwdChk(session.getAttribute("userid").toString());
		System.out.println(oldPwd+" "+oldpwd2);
		if(oldPwd.equals(oldpwd2) && pwd.equals(pwd2)) {
			mdao.pwdOk(pwd, session.getAttribute("userid").toString());
			
			return "redirect:memberView";
		}
		else {
			return "redirect:memberView?err=1";
		}
			
	}
	
	@RequestMapping("/useridSearch")
	public String useridSearch() {
		return "useridSearch";
	}
	
	@RequestMapping("/useridSearch1")
	public String useridSearch(String name,String phone,Model model) {
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		
		if(mdao.useridSearch(name, phone)!=null) {
		String userid=mdao.useridSearch(name,phone);
		model.addAttribute("userid",userid);
		
		return "redirect:useridSearch";
		}
		else {
			return "redirect:useridSearch?err=1";
		}
	}
	
	@RequestMapping("/pwdSearch")
	public String pwdSearch() {
		return "pwdSearch";
	}
	
	@RequestMapping("/pwdSearch1")
	public String pwdSearch1(Model model,String userid) {
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		model.addAttribute("userid",userid);
		return "pwdSearch1";
	}
	
	@RequestMapping("/pwdSear")
	public String pwdSear(MemberDTO mdto,Model model) {
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		
		if(mdao.pwdSearch(mdto)) {
			
			model.addAttribute("userid",mdto.getUserid());
			return "redirect:pwdSearch1";
		}
		else {
			return "redirect:pwdSearch?err=1";
		}
	}
	
	@RequestMapping("/pwdchg")
	public String pwdchg(String pwd,String pwd2,String userid) {
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		
		if(pwd.equals(pwd2)) {
			mdao.pwdchg(pwd,userid);
			return "redirect:login";
		}
		else {
			return "redirect:pwdSearch1?err=1&userid="+userid;
		}
	}
}
