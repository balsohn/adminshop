package kr.co.server_test.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.server_test.dto.MemberDTO;

@Mapper
public interface MemberMapper {

	public int useridChk(String userid);

	public void memberOk(MemberDTO mdto);

	public boolean loginOk(String userid, String pwd);

}
