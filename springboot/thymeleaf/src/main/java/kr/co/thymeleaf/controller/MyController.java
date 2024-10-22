package kr.co.thymeleaf.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@RequestMapping("/")
	public String home() {
		return "redirect:/first";
	}
	
	@RequestMapping("/first")
	public String first(Model model) {
		model.addAttribute("name","원더우먼");
		model.addAttribute("juso","<b>juso</b>");
		return "/first";
	}
	
	@RequestMapping("/second")
	public String second(Model model) {
		model.addAttribute("pimg","1.jpg");
		model.addAttribute("width","120");
		model.addAttribute("height","90");
		model.addAttribute("name","손지호");
		model.addAttribute("third","third");
		return "/second";
	}
	
	@RequestMapping("/third")
	public String third(Model model) {
		model.addAttribute("url","http://www.coupang.com");
		model.addAttribute("urlText","쿠팡");
		model.addAttribute("url2","thirdEx");
		model.addAttribute("name","슈퍼맨");
		model.addAttribute("url2Text","클릭해보세요.");
		model.addAttribute("juso","독도");
		model.addAttribute("age","33");
		
		model.addAttribute("txt2","thirdEx로");
		return "/third";
	}
	
	@RequestMapping("/thirdEx")
	public String thirdEx(Model model, HttpServletRequest request) {
		model.addAttribute("name",request.getParameter("id"));
		model.addAttribute("juso",request.getParameter("juso"));
		model.addAttribute("age",request.getParameter("age"));
		
		return "/thirdEx";
	}
	
	@RequestMapping("/fourth")
	public String fourth(Model model) {
		int sung=1; // 1:남자, 2:여자
		model.addAttribute("sung",sung);
		
		int chk=1;
		model.addAttribute("chk",chk);
		
		int food=2;
		model.addAttribute("food",food);
		
		int num=1; // 1:울릉도, 2:독도, 3:만재도, 4:거가도, 그외: 영도
		model.addAttribute("num",num);
		
		return "/fourth";
	}
	
	@RequestMapping("/fifth")
	public String fifth(Model model) {
		ArrayList<MemberDTO> list=new ArrayList<>();
		
		MemberDTO mdto=new MemberDTO();
		mdto.setName("홍길동");
		mdto.setJuso("울릉도");
		mdto.setAge(44);
		
		list.add(mdto);
		
		mdto=new MemberDTO();
		mdto.setName("원더우먼");
		mdto.setJuso("하와이");
		mdto.setAge(66);
		
		list.add(mdto);
		
		mdto=new MemberDTO();
		mdto.setName("슈퍼맨");
		mdto.setJuso("마라도");
		mdto.setAge(77);
		
		list.add(mdto);
		
		mdto=new MemberDTO();
		mdto.setName("배트맨");
		mdto.setJuso("제주도");
		mdto.setAge(50);
		
		list.add(mdto);
		
		model.addAttribute("mdto",list);
		
		return "/fifth";
	}
}
