package kr.co.cookie2;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.util.WebUtils;

@Controller
public class ProductController {

	@RequestMapping("/list")
	public String proList()
	{
		return "list";
	}
	
	@RequestMapping("/content")
	public String proContent(HttpServletRequest request, Model model)
	{
		String pcode=request.getParameter("pcode");
		String img=request.getParameter("img");
		
		model.addAttribute("pcode",pcode);
		model.addAttribute("img",img);
		
	    return "/content";	
	}
	
	@RequestMapping("/addCart")
	public @ResponseBody String addCart(HttpServletRequest request, HttpServletResponse response) {
		String pcode=request.getParameter("pcode");
		Cookie cookie = WebUtils.getCookie(request, "pcode");
		
		String pcodeVal="";
		if(cookie==null) {
			pcodeVal=pcode+"/";
		}
		else {
			if(cookie.getValue().indexOf(pcode)==-1) {				
				pcodeVal=cookie.getValue()+pcode+"/";
			} else {
				pcodeVal=cookie.getValue();
			}
		}
		
		cookie=new Cookie("pcode",pcodeVal);
		cookie.setMaxAge(600);
		response.addCookie(cookie);
		
		return "0";
	}
	
	@RequestMapping("/cartView")
	public String cartView(HttpServletRequest request,HttpServletResponse response,Model model) {
		Cookie cookie=WebUtils.getCookie(request, "pcode");
		String[] cookies=cookie.getValue().split("/");
		
		model.addAttribute("pcode",cookies);
		
		return "cartView";
	}
	
	@RequestMapping("delCart")
	public @ResponseBody String delCart(HttpServletRequest request,HttpServletResponse response) {
		String pcode=request.getParameter("pcode");
		Cookie cookie=WebUtils.getCookie(request, "pcode");
		String pcodeAll=cookie.getValue().replace(pcode+"/", "");
		
		cookie=new Cookie("pcode",pcodeAll);
		cookie.setMaxAge(600);
		response.addCookie(cookie);
		
		return "0";
	}
	
}
