package kr.co.json;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class JsonController {

	@Autowired
	private JsonMapper mapper;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/cal";
	}
	
	@RequestMapping("cal")
	public String cal(HttpServletRequest request, Model model) {
		model.addAttribute("currentYear",request.getParameter("y"));
		model.addAttribute("currentMonth",request.getAttribute("m"));
		return "cal";
	}
	
	@RequestMapping("writeCal")
	public String writeCal(JsonDTO jdto,Model model,HttpServletRequest request) {
		mapper.writeCal(jdto);
		String m=request.getParameter("currentMonth");
		String y=request.getParameter("currentYear");
		
		System.out.println(m+" "+y);
		return "redirect:cal?m="+m+"&y="+y;
	}
	
	@RequestMapping("getCals")
	public @ResponseBody List<JsonDTO> getCals(String ym) {
		return mapper.cal(ym);
	}
}
