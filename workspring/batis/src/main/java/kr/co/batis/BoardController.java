package kr.co.batis;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	@Autowired 
	private SqlSession sqlSession;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/list")
	public String list(Model model,HttpServletRequest request) {
		BoardDAO bdao=sqlSession.getMapper(BoardDAO.class);
		
		int page=(request.getParameter("page")==null)?1:Integer.parseInt(request.getParameter("page"));
		int index=(page-1)*10;
		int p=(page-1)/10;
		int pstart=p*10+1;
		int pend=pstart+9;
		int pageSize=(request.getParameter("pageSize")==null)?10:Integer.parseInt(request.getParameter("pageSize"));
		int chong=bdao.getChong(pageSize);
		if(chong<pend) {
			pend=chong;
		}
		
		ArrayList<BoardDTO> list=bdao.list(index,pageSize);
		model.addAttribute("list",list);
		model.addAttribute("page",page);
		model.addAttribute("pstart",pstart);
		model.addAttribute("pend",pend);
		model.addAttribute("chong",chong);
		model.addAttribute("pageSize",pageSize);
		return "list";
	}
	
	@RequestMapping("/readnum")
	public String readnum(HttpServletRequest request) {
		BoardDAO bdao=sqlSession.getMapper(BoardDAO.class);
		String id=request.getParameter("id");
		String page=request.getParameter("page");
		String pageSize=request.getParameter("pageSize");
		
		bdao.readnum(id);
		
		return "redirect:content?id="+id+"&page="+page+"&pageSize="+pageSize;
	}
	
	@RequestMapping("/content")
	public String content(HttpServletRequest request,Model model) {
		
		String id=request.getParameter("id");
		String page=request.getParameter("page");
		String pageSize=request.getParameter("pageSize");
		
		BoardDAO bdao=sqlSession.getMapper(BoardDAO.class);
		BoardDTO bdto=bdao.content(id);
		
		model.addAttribute("bdto",bdto);
		model.addAttribute("page",page);
		model.addAttribute("pageSize", pageSize);
		
		return "content";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request,Model model) {
		String id=request.getParameter("id");
		String page=request.getParameter("page");
		String pageSize=request.getParameter("pageSize");
		
		BoardDAO bdao=sqlSession.getMapper(BoardDAO.class);
		BoardDTO bdto=bdao.update(id);
		
		model.addAttribute("bdto",bdto);
		model.addAttribute("page",page);
		model.addAttribute("pageSize",pageSize);
		
		return "update";
	}
	
	@RequestMapping("/updateOk")
	public String updateOk(BoardDTO bdto, HttpServletRequest request) {
		String page=request.getParameter("page");
		String pageSize=request.getParameter("pageSize");
		
		BoardDAO bdao=sqlSession.getMapper(BoardDAO.class);
		
		if(bdao.isPwd(bdto.getId(), bdto.getPwd())) {
			bdao.updateOk(bdto);
			
			return "redirect:content?id="+bdto.getId()+"&page="+page+"&pageSize="+pageSize;
		}
		else
		{
			return "redirect:update?err=1&id="+bdto.getId()+"&page="+page+"&pageSize="+pageSize;
		}
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		int id=Integer.parseInt(request.getParameter("id"));
		String page=request.getParameter("page");
		String pageSize=request.getParameter("pageSize");
		String pwd=request.getParameter("pwd");

		BoardDAO bdao=sqlSession.getMapper(BoardDAO.class);
		
		if(bdao.isPwd(id, pwd)) {
			bdao.delete(id);
			
			return "redirect:list?page="+page+"&pageSize="+pageSize;
		}
		else {
			return "redirect:content?err=1&id="+id+"&page="+page+"&pageSize="+pageSize;
		}
	}
}
