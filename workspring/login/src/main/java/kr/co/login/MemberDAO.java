package kr.co.login;

public interface MemberDAO {
	
	public int useridCheck(String id);
	public void memberOk(MemberDTO mdto);
	public boolean loginOk(MemberDTO mdto);
	public String getName(String userid);
	public MemberDTO memberView(String userid);
	public void phoneOk(String phone,String userid);
	public void emailOk(String email,String userid);
	public String pwdChk(String userid);
	public void pwdOk(String pwd,String userid);
	public String useridSearch(String name,String phone);
	public boolean pwdSearch(MemberDTO mdto);
	public void pwdchg(String pwd,String userid);
}
