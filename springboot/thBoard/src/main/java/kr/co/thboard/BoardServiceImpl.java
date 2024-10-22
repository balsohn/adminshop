package kr.co.thboard;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Service
@Qualifier("bs")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;

	@Override
	public String list(Model model,HttpServletRequest request) {
		int page=request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
		int index=(page-1)*10;
		int p=(page-1)/10;
		int pstart=p*10+1;
		int pend=pstart+9;
		int chong=mapper.getChong();
		if(pend>chong) {
			pend=chong;
		}
		
		ArrayList<BoardDTO> list=mapper.list(index);
		model.addAttribute("blist",list);
		model.addAttribute("page",page);
		model.addAttribute("pstart",pstart);
		model.addAttribute("pend",pend);
		model.addAttribute("chong",chong);
		return "/list";
	}

	@Override
	public String readnum(HttpServletRequest request) {
		String id=request.getParameter("id");
		String page=request.getParameter("page");
		mapper.readnum(id);
		return "redirect:/content?id="+id+"&page="+page;
	}

	@Override
	public String content(HttpServletRequest request, Model model) {
		String id=request.getParameter("id");
		String page=request.getParameter("page");
		BoardDTO bdto=mapper.content(id);
		model.addAttribute("bdto",bdto);
		model.addAttribute("page",page);
		
		return "/content";
	}

	@Override
	public String writeOk(BoardDTO bdto) {
		mapper.writeOk(bdto);
		return "redirect:/list";
	}

	@Override
	public String delete(HttpServletRequest request) {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		String page=request.getParameter("page");
		
		if(mapper.isWrite(id, name, pwd)) {
			mapper.delete(id);
			return "redirect:/list?page="+page;
		} else {
			return "redirect:/content?id="+id+"&err=1&page="+page;
		}
	}

	@Override
	public String update(HttpServletRequest request, Model model) {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		String page=request.getParameter("page");
		
		if(mapper.isWrite(id, name, pwd)) {
			BoardDTO bdto=mapper.content(id);
			model.addAttribute("bdto",bdto);
			model.addAttribute("page",page);
			
			return "/update";
			
		} else {
			return "redirect:/content?id="+id+"&err=1&page="+page;
		}
	}

	@Override
	public String updateOk(BoardDTO bdto,HttpServletRequest request) {
		String page=request.getParameter("page");
		mapper.updateOk(bdto);
		return "redirect:/content?id="+bdto.getId()+"&page="+page;
	}
	
	
	
}
