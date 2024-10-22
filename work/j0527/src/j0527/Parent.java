package j0527;

public class Parent {
	
	//상속 :inheritance 
	//객체지향언어 : 클래스가 가지는 재산 => 속성, 메소드 
	//윈도우나 앱프로그램에서 많이 사용됨. 
	//상속 클래스(상위): Super class, base class 
	
	int kor;
	int eng;
	int hap;
	
	public void calc()
	{
		hap=kor+eng;
	}
	
	public void output()
	{
		System.out.println("합 : "+hap);
	}

}
