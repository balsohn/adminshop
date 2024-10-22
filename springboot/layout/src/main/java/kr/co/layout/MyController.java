package kr.co.layout;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@GetMapping("/layoutOne/index")
	public String index() {
		return "/layoutOne/index";
	}
	
	@GetMapping("/layoutOne/myInfo")
	public String myInfo() {
		return "/layoutOne/myInfo";
	}
	
	@GetMapping("/layoutTwo/main")
	public String main() {
		return "/layoutTwo/main";
	}
	
	@RequestMapping("/layoutThree/main")
	public String main2() {
		return "/layoutThree/main";
	}
	
	@GetMapping("/layoutFour/main")
	public String main3(Model model) {
		model.addAttribute("name","배트맨");
		model.addAttribute("juso","울릉도");
		model.addAttribute("err",1);
		return "/layoutFour/main";
	}
}
