package kr.co.board1;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class BoardController {

	@Autowired
	private SqlSession sqlSession;
	
	public String list(Model model,HttpServletRequest request) {
		BoardDAO bdao=sqlSession.getMapper(BoardDAO.class);
		int page=(request.getParameter("page")==null)?1:Integer.parseInt(request.getParameter("page"));
		int index=(page-1)*10;
		int p=(page-1)/10;
		int pstart=p*10+1;
		int pend=pstart+9;
		int chong=bdao.getChong();
		System.out.println(chong);
		if(chong<pend) {
			pend=chong;
		}
		
		
		ArrayList<BoardDTO> list=bdao.list(index);
		model.addAttribute("list",list);
		model.addAttribute("pstart",pstart);
		model.addAttribute("pend",pend);
		model.addAttribute("chong",chong);
		return "list";
	}
	
	public String readnum(HttpServletRequest request) {
		BoardDAO bdao=sqlSession.getMapper(BoardDAO.class);
		String id=request.getParameter("id");
		bdao.readnum(id);
		
		return "redirect:content?id="+id;
	}
	
	public String content(HttpServletRequest request,Model model) {
		BoardDAO bdao=sqlSession.getMapper(BoardDAO.class);
		String id=request.getParameter("id");
		BoardDTO bdto=bdao.content(id);
		model.addAttribute("bdto",bdto);
		return "content";
	}
}
