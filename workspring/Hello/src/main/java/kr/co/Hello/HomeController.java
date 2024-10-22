package kr.co.Hello;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // 사용자의 요청을 모아놓은 파일
public class HomeController {
	// 모든 jsp를 브라우저에서 보고싶으면 무조건 controller파일에 등록
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home"; // 브라우저에 전달하고 싶은 jsp문서이름
	}
	
	// home으로 문서를 보고싶다면
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String aaa() // 메소드명은 마음대로 => 요청의 이름과 동일하게
	{
		return "/home";
	}
	
	@RequestMapping(value="/mypage", method=RequestMethod.GET)
	public String myhome()
	{
		return "/mypage";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test()
	{
		return "/test";
	}
	
	@RequestMapping("/myinfo")  // 주소
	public String bbb()
	{
		return "/myinfo";  // jsp파일
	}
}
