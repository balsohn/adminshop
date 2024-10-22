package inhConst;

public class Son extends Parent{
	//Son클래스의 생성자를 실행하면 Parent생성자가 실행이 된다. 
	//Son클래스의 생성자의 실행전에 부모클래스의 생성자가 실행된다.
	
	Son()
	{
		//Parent 생성자를 먼저 실행 
		//super(); 생략가능 
		System.out.println("Son 생성자");
	}
	
}
