package kr.co.serverProgram.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.serverProgram.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	
	public int useridChk(String userid);
	public void memberOk(MemberDTO mdto);
	public boolean loginOk(String userid, String pwd);
}
