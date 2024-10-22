package kr.co.boardModel3.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.boardModel3.dao.BoardDao;
import kr.co.boardModel3.dto.BoardDto;
import kr.co.boardModel3.service.BoardService;
import kr.co.boardModel3.service.BoardServiceImpl;


@Controller
public class BoardController {
    
	@Autowired
	@Qualifier("bs")
	private BoardService bs;
	
	@RequestMapping("/")
	public String home()
	{
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model,
			HttpServletRequest request)
	{
	    return bs.list(model,request);
	}
	
	@RequestMapping("/readnum")
	public String readnum(HttpServletRequest request)
	{
		return bs.readnum(request);
	}
	
	@RequestMapping("/content")
	public String content(HttpServletRequest request,
			Model model)
	{
		return bs.content(request,model);
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request)
	{
		return bs.delete(request);
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request,
			Model model)
	{
		return bs.update(request,model);
	}
	
	@RequestMapping("/updateOk")
	public String updateOk(BoardDto bdto,
			HttpServletRequest request)
	{
		return bs.updateOk(bdto,request);
	}
	
	@RequestMapping("/write")
	public String write()
	{
		return bs.write();
	}
	
	@RequestMapping("/writeOk")
	public String writeOk(BoardDto bdto)
	{
		return bs.writeOk(bdto);
	}
}



