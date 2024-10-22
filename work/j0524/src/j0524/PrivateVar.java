package j0524;

public class PrivateVar {
	
	//----------접근제한자 private을 외부클래스에서 값을 할당하는 방법---------//
	
	private int age;
	private String name;
	private String juso;
	
	//[1]동일한 클래스에선 private에 값을 할당할 수 있다. 
	//다만 변수에 할당된 하나의 값만 호출 가능하다. 
	/*
	public void init()
	{
		age=45;
		name="홍길동";
		juso="고양시";
	}
	*/
	
	//[2]다양한 값이 들어올 수 있도록 매개변수를 활용한다. 
	public void init(int age, String name, String juso)
	{
		this.age=age;
		this.name=name;
		this.juso=juso;
	}

	//[3]출력의 경우 public인 메소드를 이용 
	public void print()
	{
		System.out.println("이름 :"+ name);
		System.out.println("나이 :"+ age);
		System.out.println("주소 :"+ juso);
	}
}
