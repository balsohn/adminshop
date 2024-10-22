package kr.co.json;

import java.util.ArrayList;

public interface MemberDAO {
	
	public MemberDTO getMember(String id);
	public ArrayList<MemberDTO> getMembers();
	public MemberDTO oneMember(String id);
	public ArrayList<MemberDTO> threeMember();
	
}
