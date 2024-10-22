package kr.co.test.Controller;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.test.DAO.BoardDAO;
import kr.co.test.DTO.BoardDTO;

@Controller
public class BoardController {

/*	@Autowired
	private SqlSession sql;*/
	
	@Autowired
	private BoardDAO bdao;
	
	@RequestMapping("/")
	public String home() {
		return "home";
		
	}
	
	@RequestMapping("list")
	public String list(Model model) {
	//	BoardDAO bdao=sql.getMapper(BoardDAO.class);
		
		model.addAttribute("bdao", bdao.list());
		
		return "list";
	}
}
