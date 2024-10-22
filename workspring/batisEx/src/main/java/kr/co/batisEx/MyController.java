package kr.co.batisEx;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@Autowired SqlSession sqlSession;

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request,Model model) {
		MyDAO mdao=sqlSession.getMapper(MyDAO.class);
		
		int page=(request.getParameter("page")==null)?1:Integer.parseInt(request.getParameter("page"));
		int index=(page-1)*10;
		int p=(page-1)/10;
		int pstart=p*10+1;
		int pend = pstart+9;
		int chong=mdao.getChong();
		
		if(chong<pend) {
			pend=chong;
		}
		
		ArrayList<MyDTO> list=mdao.list(index);
		
		model.addAttribute("list",list);
		model.addAttribute("page",page);
		model.addAttribute("pstart",pstart);
		model.addAttribute("pend",pend);
		model.addAttribute("chong",chong);
		
		return "list";
	}
	
	@RequestMapping("/readnum")
	public String readnum(HttpServletRequest request) {
		String id= request.getParameter("id");
		MyDAO mdao=sqlSession.getMapper(MyDAO.class);
		
		mdao.readnum(id);
		
		return "redirect:content?id="+id;
	}
	
	@RequestMapping("/content")
	public String content(HttpServletRequest request,Model model) {
		MyDAO mdao=sqlSession.getMapper(MyDAO.class);
		
		String id=request.getParameter("id");
		System.out.println(id);
		MyDTO mdto=mdao.content(id);
		model.addAttribute("mdto",mdto);
		System.out.println(mdto.getContent());
		
		return "content";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		
		MyDAO mdao=sqlSession.getMapper(MyDAO.class);
		String id=request.getParameter("id");
		mdao.delete(id);
		
		return "redirect:list";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request,Model model) {
		
		String id=request.getParameter("id");
		MyDAO mdao=sqlSession.getMapper(MyDAO.class);
		MyDTO mdto=mdao.update(id);
		
		model.addAttribute("mdto",mdto);
		
		return "update";
	}
}
