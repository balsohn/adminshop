package inhConst;

public class Son2 extends Parent2{
	//부모클래스의 생성자에 매개변수가 있을경우
	//매개변수 전달내용이 없으면 오류 
	
	/*
	Son2(int pass){
		super(90); //괄호안에 직접 값 입력
		//매개변수가 존재하는 부모클래스의 생성자에 들어갈 값을 
		//고정이 아닌 변화가 있는 값을 보내려면 
		//자식생성자에 값을 보낸 것을 다시 부모클래스생성자에 보낸다.  
		System.out.println("Son2 생성자");
	}
	*/
	
	String name;
	
	//부모와 자식클래스 둘다 매개변수가 필요하다면 
	Son2(int pass,String name)
	{
		super(pass);
		this.name=name;
		}
	public void output() {
		
		System.out.println(name);
	}

}
