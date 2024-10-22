package j0524;

public class ConstEx {
	
	//------------생성자Constructor-----------//
	//[1]생성자 : 클래스와 이름이 똑같은 메소드

	//1.프로그램 실행시 필요한 초기값 생성 
	//2.실행할 내용이 없으면 생략가능. 
	//3.꼭 사용하는 경우: 속성에 초기화되지않은 final 변수가 있다면 
	
	
	//3.
	final int a=100;
	final int b;
	
	ConstEx(int b)
	{
		this.b=b;
		//무조건 클래스 영역에서 만들어진 변수만 사용 가능. 
		System.out.println(b);
	}
	
	
	/*
	//1.
	ConstEx()
	{
		//실행할 내용 
		System.out.println("생성자 부분");
	}
	*/
	
	//2.
	//생략할 경우 컴파일이 비어있는 생성자를 만들어서 실행한다. 
	/*
	ConstEx(){
		//실행할 내용 
	}
	*/
	

	
}
