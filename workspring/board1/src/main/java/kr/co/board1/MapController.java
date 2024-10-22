package kr.co.board1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapController {

	@Autowired
	BoardController bcon;
	
	@RequestMapping("list")
	public String list(Model model,HttpServletRequest request) {

		return bcon.list(model,request);
	}
	
	@RequestMapping("readnum")
	public String readnum(HttpServletRequest request) {
		
		return bcon.readnum(request);
	}
	
	@RequestMapping("content")
	public String content(HttpServletRequest request,Model model) {
		return bcon.content(request,model);
	}
}
