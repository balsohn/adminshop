package kr.co.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/ajax01")
	public String ajax01() {
		return "/ajax01";
	}
	
	@RequestMapping("/ajax02")
	public String ajax02() {
		return "/ajax02";
	}
	
	@RequestMapping("/ajax03")
	public String ajax03() {
		return "/ajax03";
	}
	
	@RequestMapping("/ajaxOk")
	public @ResponseBody String ajaxOk() {
		return "안녕하세요";
	}
}
