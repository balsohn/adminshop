package kr.co.thboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BoardController {

	@Autowired
	@Qualifier("bs")
	private BoardService service;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model,HttpServletRequest request) {
		return service.list(model,request);
	}
	
	@RequestMapping("/readnum")
	public String readnum(HttpServletRequest request) {
		return service.readnum(request);
	}
	
	@RequestMapping("/content")
	public String content(HttpServletRequest request,Model model) {
		return service.content(request,model);
	}
	
	@RequestMapping("/write")
	public String write() {
		return "/write";
	}
	
	@RequestMapping("/writeOk")
	public String writeOk(BoardDTO bdto) {
		return service.writeOk(bdto);
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		return service.delete(request);	
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request,Model model) {
		return service.update(request,model);
	}
	
	@RequestMapping("/updateOk")
	public String updateOk(BoardDTO bdto,HttpServletRequest request) {
		return service.updateOk(bdto,request);
	}
}
