package kr.co.oracle;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BoardController {

	@Autowired
	private BoardMapper mapper;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/write";
	}
	
	@RequestMapping("/write")
	public String write() {
		return "/write";
	}
	
	@RequestMapping("/writeOk")
	public String writeOk(BoardDTO bdto) {
		
	/*	String[] names= {"홍길동","배트맨","슈퍼맨","나그네","하하하","뽀로로","원더우먼"};
		String content=bdto.getContent();
		for(int i=0;i<3415;i++) {
			int n=(int) (Math.random()*7);
			bdto.setContent(content+" "+i);
			bdto.setName(names[n]);
			mapper.writeOk(bdto);
		}*/
		
		mapper.writeOk(bdto);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model,HttpServletRequest request) {
		int page=request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
		int p=(page-1)/10;
		int pstart=p*10+1;
		int pend=pstart+9;
		int chong=mapper.getChong();
		if(pend>chong) {
			pend=chong;
		}
		
		model.addAttribute("page",page);
		model.addAttribute("pstart",pstart);
		model.addAttribute("pend",pend);
		model.addAttribute("chong",chong);
		
		ArrayList<BoardDTO> list=mapper.list(page);
		
		model.addAttribute("list",list);
		return "/list";
	}
	
	@RequestMapping("/readnum")
	public String readnum(HttpServletRequest request) {
		String id=request.getParameter("id");
		mapper.readnum(id);
		return "redirect:/content?id="+id;
	}
	
	@RequestMapping("/content")
	public String content(Model model,HttpServletRequest request) {
		String id=request.getParameter("id");
		model.addAttribute("bdto",mapper.content(id));
		return "/content";
	}
	
	@RequestMapping("/delete")
	public String delete(BoardDTO bdto) {
		System.out.println(mapper.isWrite(bdto.getId(),bdto.getName(),bdto.getPwd()));
		System.out.println(bdto.getName()+" "+bdto.getPwd());
		if(mapper.isWrite(bdto.getId(),bdto.getName(),bdto.getPwd())!=0) {
			// mapper.delete(bdto.getId());
			return "redirect:/list";
		} else {
			return "redirect:/content?err=1&id="+bdto.getId();
		}
		
	}
}
