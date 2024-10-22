package j0524;

public class PrivateVar2 {
	
	//private인 속성의 값을 public 메소드를 이용하여 줄 때 
	private String userid;
	private String name;
	private int level;
	private String phone;
	
	
	//[3]각각의 private속성의 값을 리턴해주는 public메소드 getter  
	public String method5()
	{
		return userid;
	}
	public String method6()
	{
		return name;
	}
	public int method7()
	{
		return level;
	}
	public String method8()
	{
		return phone;
	}
	
	//[1]한번에 모든 값을 줄 수도 있다 setter 
	//[2]하나의 속성마다 접근할 수도 있다. 
	public void method1(String userid)
	{
		this.userid=userid;
	}
	public void method2(String name)
	{
		this.name=name;
	}
	public void method3(int level)
	{
		this.level=level;
	}
	public void method4(String phone)
	{
		this.phone=phone;
	}

	//출력
	public void print()
	{
		System.out.println("아이디: "+userid);
		System.out.println("이 름: "+name);
		System.out.println("레 벨: "+level);
		System.out.println("번 호: "+phone);
	}

}
