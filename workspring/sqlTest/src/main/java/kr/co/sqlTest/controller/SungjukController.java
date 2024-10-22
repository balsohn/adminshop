package kr.co.sqlTest.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sqlTest.dto.SungjukDTO;
import kr.co.sqlTest.mapper.SungjukMapper;

@Controller
public class SungjukController {

	@Autowired
	private SqlSession sql;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home1(HttpServletRequest request,Model model) {
		SungjukMapper sm=sql.getMapper(SungjukMapper.class);
		String type=request.getParameter("type")==null?"kor":request.getParameter("type");
		
		ArrayList<SungjukDTO> slist=sm.list(type);
		for(int i=0;i<slist.size();i++) {
			int tot=slist.get(i).getKor()+slist.get(i).getEng()+slist.get(i).getMat();
			int avg=tot/3;
			slist.get(i).setTot(tot);
			slist.get(i).setAvg(avg);
		}
		model.addAttribute("slist",slist);
		return "/home";
	}
	
	@RequestMapping("/getIphak")
	public @ResponseBody String getIphak(HttpServletRequest request) {
		String name=request.getParameter("name");
		SungjukMapper sm=sql.getMapper(SungjukMapper.class);
		String iphak=sm.getIphak(name);
		
		return iphak;
	}
}
