package kr.co.include;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("my")
	public String my() {
		return "my";
	}
	
	@RequestMapping("your")
	public String your() {
		return "your";
	}
}
