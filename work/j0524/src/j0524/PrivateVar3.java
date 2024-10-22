package j0524;

public class PrivateVar3 {
	
	private String userid;
	private String name;
	private int level;
	private String phone;
	
	 //private속성값을 리턴해주는 메소드 => getter 
	 public String getUserid()
	 {
		 return userid;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 
	//private속성에 값을 주는 메소드 => setter 
	 public void setUserid(String userid)
	 {
		 this.userid=userid;
	 }
	 
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 
	
	 
}
