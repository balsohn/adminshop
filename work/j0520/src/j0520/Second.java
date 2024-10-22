package j0520;

public class Second {


 //나이가 20이상이면 "어서오세요"
//		20미만이면 "다음에 오세요"

	int age;
	//속성 : 클래스의 명령을 실행시키기 위해 필요한 변수
	//(field)
	
	
	//메소드 : 이 클래스에서 실행하고자 하는 명령어 묶음 
	public void check() //접근제어자public 자료형void 메소드명(check)은 임의설정 가능 
	{
		if(age>=20)
		{
			System.out.println("어서오세요");
		}
		else
		{
			System.out.println("다음에 오세요");
		}
	}
	
	
	
	
	
	
	
	
}
