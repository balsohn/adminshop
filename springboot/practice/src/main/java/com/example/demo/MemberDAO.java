package com.example.demo;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberDAO {
	
	@Select("select * from member order by id desc")
	public ArrayList<MemberDTO> list();
	
	@Insert("insert into member (userid,name) values (#{userid},#{name})")
	public String writeOk(MemberDTO mdto);
}
