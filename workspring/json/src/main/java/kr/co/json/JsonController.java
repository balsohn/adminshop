package kr.co.json;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/")
	public String home() {
		return "home";
		
	}
	
	@RequestMapping("json1")
	public String json1() {
		return "json1";
	}
	
	@RequestMapping("getValue")
	public @ResponseBody String getValue() {
		String name="batman";
		String age="22";
		String phone="010-1234-5678";
		System.out.println("{\"name\":\""+name+"\",\"age\":\""+age+"\",\"phone\":\""+phone+"\"}");
		
		return "{\"name\":\""+name+"\",\"age\":\""+age+"\",\"phone\":\""+phone+"\"}";
	}
	
	@RequestMapping("json2")
	public String json2() {
		return "json2";
	}
	
	@RequestMapping("getMember")
	public @ResponseBody String getMember(HttpServletRequest request) {
		String id=request.getParameter("id");
		
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		MemberDTO mdto=mdao.getMember(id);
		
		String name=URLEncoder.encode(mdto.getName());
		
		
		String data="{\"userid\":\""+mdto.getUserid()+"\",\"id\":\""+mdto.getId()+"\""
				+ ",\"name\":\""+name+"\",\"phone\":\""+mdto.getPhone()+"\"}"; // {"userid
		
		System.out.println(data);

		return data;
	}
	
	@RequestMapping("json3")
	public String json3() {
		return "json3";
	}
	
/*	@RequestMapping("getMembers")
	public @ResponseBody String getMembers() {
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		ArrayList<MemberDTO> members=mdao.getMembers();
		
		String data="[";
		for(int i=0;i<members.size();i++) {
			MemberDTO mdto=members.get(i);
			String name=URLEncoder.encode(mdto.getName());
			data=data+"{\"userid\":\""+mdto.getUserid()+"\",\"id\":\""+mdto.getId()+"\""
					+ ",\"name\":\""+name+"\",\"phone\":\""+mdto.getPhone()+"\"}";
			
			if(i!=members.size()-1) {
				data=data+",";
			}
		}
		
		data=data+"]";
		
		System.out.println(data);
		
		return data;
	}	*/
	
	@RequestMapping("json4")
	public String json4() {
		return "json4";
	}
	@RequestMapping("getMembers")
	public @ResponseBody ArrayList<MemberDTO> getMembers()
	{
		MemberDAO mdao=sqlSession.getMapper(MemberDAO.class);
		ArrayList<MemberDTO> members=mdao.getMembers();
		System.out.println(members.size());
		return members;
	}
}
