package j0531;

public interface InterfaceEx {

	//interface : 추상메소드의 집합 (주목적)
	//[1]클래스를 만든 후 public class 클래스명에서 class => interface로 변경 
	//[2]새파일을 생성할 때 interface 
	
	//아래의 static은 객체 생성없이 접근할 수 있는 속성 혹은 메소드 (이탤릭체로 표시되는 것은 다 static)
	
	//속성, 메소드
	//속성을 정의하면 =>public static final
	//(고정된 값을 할당해야 한다.무조건 부여)
	
	int kor=60;
	public static final int eng=66;
	
	//메소드 : {}를 포함하지 않는 추상메소드만 가능하다 
	public void print();
	public void output();
	
	//8버전 이후에 추가된 메소드=> static, default는 사용가능
	default void test()
	{
		//실행가능한 명령어 
	}
	static void test2()
	{
		//실행가능한 명령어 
	}
	
	
}
