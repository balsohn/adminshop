package kr.co.json;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("myjson")
	public String myjson() {
		return "myjson";
	}
	
	@RequestMapping("/getData")
	public @ResponseBody String getData() {
		// 요청한 자료를 자바스크립트로 전달
		// 많은 데이터일 경우에는
		// json데이터로 바꿀수 있는 형태로 보낸다.
		// {"변수명":"값", "변수명":"값", "변수명":"값"}
		
		
		return "{\"name\":\"batman\",\"age\":\"33\"}";
	}
	
	@RequestMapping("myjson2")
	public String myjson2() {
		return "myjson2";
	}
	
	@RequestMapping("/oneMember")
	public @ResponseBody MemberDTO oneMember(HttpServletRequest request) {
		
		String userid= request.getParameter("userid");
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		MemberDTO mdto=mdao.oneMember(userid);
		
		return mdto;
	}
	
	@RequestMapping("threeMember")
	public @ResponseBody ArrayList<MemberDTO> threeMember(){
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		
		return mdao.threeMember();
	}
}
