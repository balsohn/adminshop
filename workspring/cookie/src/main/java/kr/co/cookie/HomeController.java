package kr.co.cookie;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "redirect:jscookie";
	}
	
	@RequestMapping("/cookieGen")
	public String cookieGen(HttpServletResponse response) {
		Cookie cookie=new Cookie("name","홍길동");
		cookie.setMaxAge(600);
		
		response.addCookie(cookie);
		
		cookie=new Cookie("kor","99");
		cookie.setMaxAge(600);
		response.addCookie(cookie);
		
		cookie=new Cookie("eng","88");
		cookie.setMaxAge(600);
		response.addCookie(cookie);
		
		cookie=new Cookie("mat","77");
		cookie.setMaxAge(600);
		response.addCookie(cookie);
		
		return "cookieGen";
	}
	
	@RequestMapping("/cookieView")
	public String cookieView(HttpServletRequest request,Model model) {
		Cookie[] cookies = request.getCookies(); // 클라이언트에서 쿠키값 읽어오기
		
		
		String name=null;
		String kor=null;
		String eng=null;
		String mat=null;
		for(int i=0;i<cookies.length;i++) {
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
			
			if(cookies[i].getName().equals("name")) {
				name=cookies[i].getValue();
			}
			if(cookies[i].getName().equals("kor")) {
				kor=cookies[i].getValue();
			}
			if(cookies[i].getName().equals("eng")) {
				eng=cookies[i].getValue();
			}
			if(cookies[i].getName().equals("mat")) {
				mat=cookies[i].getValue();
			}
		}
		
		
		model.addAttribute("name",name);
		model.addAttribute("kor",kor);
		model.addAttribute("eng",eng);
		model.addAttribute("mat",mat);
		return "cookieView";
	}
	
	@RequestMapping("pcode")
	public String pcode() {
		return "pcode";
	}
	
	@RequestMapping("cookieChuga")
	public @ResponseBody String cookieChuga(HttpServletRequest request,HttpServletResponse response) {
		String chk="0";
		try {
			String pcode=request.getParameter("pcode");
			
			// pcode라는 쿠키변수의 존재하는 값을 가져와야한다.
			String pcodeVal="";
			Cookie[] cookies=request.getCookies();
			for(int i=0;i<cookies.length;i++) {
				if(cookies[i].getName().equals("pcode")) {
					pcodeVal=cookies[i].getValue();
				}
			}
			Cookie cookie=new Cookie("pcode",pcodeVal+pcode+"/");
			cookie.setMaxAge(600);
			response.addCookie(cookie);
			
			System.out.println(cookie.getValue());
			
		}
		catch(Exception e) {
			chk="1";
		}
		
		return chk;
	}
	
	@RequestMapping("cookieDel")
	public @ResponseBody String cookieDel(HttpServletRequest request,HttpServletResponse response) {
		
	/*	String delcode=request.getParameter("delcode");
		Cookie[] cookies=request.getCookies();
		String pcode=null;
		for(int i=0;i<cookies.length;i++) {
			if(cookies[i].getName().equals("pcode")) {
				pcode=cookies[i].getValue();
			}
		}
		
		pcode=pcode.replace(delcode+"/", "");
		
		Cookie cookie=new Cookie("pcode",pcode);
		cookie.setMaxAge(600);
		response.addCookie(cookie);
		System.out.println(cookie.getValue());
		
		return "rediret:pcode"; */
		String delcode=request.getParameter("delcode");
		
		Cookie cookie=WebUtils.getCookie(request, "pcode");
		String pcode=cookie.getValue().replace(delcode+"/", "");
		
		cookie=new Cookie("pcode",pcode);
		cookie.setMaxAge(600);
		response.addCookie(cookie);
		
		return "0";
	}
	
	@RequestMapping("pcodeView")
	public @ResponseBody String pcodeView(HttpServletRequest request) {
		Cookie cookie=WebUtils.getCookie(request, "pcode");
		
		return cookie.getValue();
	}
	
	@RequestMapping("/pcodeDel")
	public @ResponseBody String pcodeDel(HttpServletResponse response) {
		Cookie cookie=new Cookie("pcode","");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		
		return "0";
	}

}
