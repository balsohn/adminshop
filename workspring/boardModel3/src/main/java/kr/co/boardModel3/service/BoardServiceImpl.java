package kr.co.boardModel3.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kr.co.boardModel3.dao.BoardDao;
import kr.co.boardModel3.dto.BoardDto;

@Service
@Qualifier("bs")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDao bdao;
	
    @Override
	public String list(Model model,HttpServletRequest request) 
	{
    	// 페이징 관련 값을 생성
    	int page=1;
    	if(request.getParameter("page")!=null)
    	{
    		page=Integer.parseInt(request.getParameter("page"));
    	}
    	
    	// 각 페이지의 시작 인덱스
    	int index=(page-1)*10;
    	
    	// 뷰에 페이지 링크를 출력하기
    	int pstart,pend,chong;
    	
    	pstart=page/10;
    	if(page%10 == 0)
    		pstart--;
    	
    	pstart=pstart*10+1;
    	pend=pstart+9;
    	
    	chong=bdao.getChong();
    	if(pend>chong)
    		pend=chong;
    	
    	model.addAttribute("page",page);
    	model.addAttribute("pstart",pstart);
    	model.addAttribute("pend",pend);
    	model.addAttribute("chong",chong);
		model.addAttribute("blist", bdao.list(index));	
		return "/list";
	}

	@Override
	public String readnum(HttpServletRequest request) 
	{
		String id=request.getParameter("id");
		String page=request.getParameter("page");
		bdao.readnum(id);
		 
		return "redirect:/content?id="+id+"&page="+page;
	}

	@Override
	public String content(HttpServletRequest request,
			Model model) 
	{
		String id=request.getParameter("id");
		String page=request.getParameter("page");
		
		BoardDto bdto=bdao.content(id);
        String content=bdto.getContent().replace("\r\n", "<br>");
        bdto.setContent(content);
		
        model.addAttribute("page",page);
        model.addAttribute("bdto",bdto);
        return "/content";
	}

	@Override
	public String delete(HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String page=request.getParameter("page");
		String pwd=request.getParameter("pwd");
		
		if(bdao.isPwd(id,pwd))
		{
			bdao.delete(id);
			return "redirect:/list?page="+page;
		}
		else
		{
			return "redirect:/content?id="+id+"&page="+page;
		}
	}

	@Override
	public String update(HttpServletRequest request, Model model)
	{
		String id=request.getParameter("id");
		String page=request.getParameter("page");
		
		BoardDto bdto=bdao.content(id);
		
		model.addAttribute("bdto",bdto);
		model.addAttribute("page",page);
		
		return "/update";
	}

	@Override
	public String updateOk(BoardDto bdto, HttpServletRequest request) 
	{
		String page=request.getParameter("page");
	    if(bdao.isPwd(bdto.getId(), bdto.getPwd()))
	    {
	    	bdao.updateOk(bdto);
	    	
	    	return "redirect:/content?id="+bdto.getId()+"&page="+page;
	    }
	    else
	    {
	    	return "redirect:/update?id="+bdto.getId()+"&page="+page;
	    }
	}

	@Override
	public String write() 
	{
        return "/write";
	}

	@Override
	public String writeOk(BoardDto bdto) 
	{
        bdao.writeOk(bdto);
        return "redirect:/list";
	}

}










