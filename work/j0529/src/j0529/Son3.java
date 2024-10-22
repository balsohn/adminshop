package j0529;

public class Son3 extends AbstractEx2 {
	//부모클래스가 생성자에 매개변수를 가지면
	//자식클래스는 생성자에 값을 보내야 된다.
	//무조건 자식클래스 생성자를 만들어야 된다.
	
	Son3() 
	{
		super(60); //고정 값 할당 
	}
	Son3(int pass)
	{  //매개변수를 통해 변경된 값 할당 
		super(pass);
	}
	
	//생성자가 2개 => 생성자 오버로딩 
	//생성자도 매개변수가 다르면 여러개 사용할 수 있다. 
	
	@Override
	public void output()
	{
		System.out.println("점수 : "+pass);
	}
}
