package kr.co.serverProgram.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import kr.co.serverProgram.dto.BoardDTO;
import kr.co.serverProgram.dto.MemberDTO;
import kr.co.serverProgram.mapper.BoardMapper;
import kr.co.serverProgram.mapper.MemberMapper;

@Controller
public class MemberController {

	@Autowired
	private MemberMapper mapper;
	
	@Autowired
	private BoardMapper board;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/member";
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
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request, Model model) {
		int page=request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
		int index=(page-1)*10;
		int p=(page-1)/10;
		int pstart=p*10+1;
		int pend=pstart+9;
		int chong=board.getChong();
		if(pend>chong) {
			pend=chong;
		}
				
		ArrayList<BoardDTO> list=board.list(index);
		
		model.addAttribute("list",list);
		model.addAttribute("page",page);
		model.addAttribute("pstart",pstart);
		model.addAttribute("pend",pend);
		model.addAttribute("chong",chong);
		
		
		return "/index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "/login";
	}
	
	@RequestMapping("/loginOk")
	public String loginOk(HttpServletRequest request, HttpSession session) {
		String userid=request.getParameter("userid");
		String pwd=request.getParameter("pwd");
		
		if(mapper.loginOk(userid, pwd)) {
			session.setAttribute("userid", userid);
			return "redirect:/index";
		} else {
			return "redirect:/login?err=1";
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/index";
	}
}
