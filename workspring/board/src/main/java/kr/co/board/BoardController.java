package kr.co.board;

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
	private SqlSession sql;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("list")
	public String list(Model model) {
		BoardDAO bdao=sql.getMapper(BoardDAO.class);
		ArrayList<BoardDTO> list= bdao.list();
		
		model.addAttribute("list",list);
		
		return "list";
	}
	
	@RequestMapping("write")
	public String write() {
		return "write";
	}
	
	@RequestMapping("writeOk")
	public String writeOk(BoardDTO bdto) {
		BoardDAO bdao=sql.getMapper(BoardDAO.class);
		bdao.writeOk(bdto);
		
		return "redirect:list";
	}
	
	@RequestMapping("readnum")
	public String readnum(HttpServletRequest request) {
		BoardDAO bdao=sql.getMapper(BoardDAO.class);
		String id=request.getParameter("id");
		bdao.readnum(id);
		
		return "redirect:content?id="+id;
	}
	
	@RequestMapping("content")
	public String content(Model model,HttpServletRequest request) {
		BoardDAO bdao=sql.getMapper(BoardDAO.class);
		String id=request.getParameter("id");
		BoardDTO bdto=bdao.content(id);
		
		model.addAttribute("bdto",bdto);
		return "content";
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request) {
		BoardDAO bdao=sql.getMapper(BoardDAO.class);
		String id=request.getParameter("id");
		bdao.delete(id);
		
		return "redirect:list";	
	}
	
	@RequestMapping("update")
	public String update(HttpServletRequest request,Model model) {
		BoardDAO bdao=sql.getMapper(BoardDAO.class);
		String id=request.getParameter("id");
		BoardDTO bdto=bdao.content(id);
		
		model.addAttribute("bdto",bdto);
		
		return "update";
	}
	
	@RequestMapping("updateOk")
	public String updateOk(BoardDTO bdto) {
		BoardDAO bdao=sql.getMapper(BoardDAO.class);

		if(bdao.isPwd(bdto)) {
			bdao.updateOk(bdto);
			return "redirect:content?id="+bdto.getId();
		} else {
			return "redirect:update?err=1&id="+bdto.getId();
		}
	}
}
