package kr.co.batis2;

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
}
