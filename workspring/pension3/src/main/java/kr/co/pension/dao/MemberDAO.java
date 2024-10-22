package kr.co.pension.dao;

import kr.co.pension.dto.MemberDTO;

public interface MemberDAO {
	public String useridChk(String userid);
	public void memberOk(MemberDTO mdto);
	public int loginOk(MemberDTO mdto);
}
