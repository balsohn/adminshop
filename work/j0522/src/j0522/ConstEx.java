package j0522;

public class ConstEx {
	//[1]Constructor: 생성자 
	//생성자: 객체를 생성할때 무조건 실행되는 메소드 
	//클래스의 구성내용: 속성, (메소드, 생성자)분류는 메소드와 동일하지만 다르다.
	
	
	//생성자는 이름이 정해져 있다=>클래스명(); ConstEx(); => 리턴값 X, 매개변수 O  
	
	// ConstEx ce= "new ConstEx();" 
	//이 부분만 따로 ce(객체변수) 매개변수나 리턴값으로 사용가능
	
	
	//생성자 형식
	ConstEx()//실행할 내용이 없는 생성자는 생략이 가능 
	{
		System.out.println("생성자 실행 ");
	}
	//[2]생성자는 언제 사용할까?
	//1.객체 생성시에 필요한 값의 전달  
	//(메인 메소드->new Scanner(System.in);)
	//2.상속을 했을때 부모클래스의 생성자에 값을 전달해야 될때 (라이브러리 작업 시 필요)
	
	
	public void print()
	{
		System.out.println("안녕하세요");
	}
	
	
	
	
	

}
