package j0522;

public class ConstTest {
	//2.생성자메소드의 이름은 클래스명과 동일하다 
	//비어있는 생성자는 생략해도 된다.
	
	//5.final변수는 값을 바꿀수 없는 변수이므로 변수 생성시 초기값을 줘야한다.
	//					또는 생성자를 통해서 줄 수 있는 방법이 있다. 
	final int chk=100; 
	final int num;

	int pass;
	
	/*
	ConstTest() 리턴 x 
	{
		
	}
	*/
	ConstTest(int pass, int num) 
	{
		//3.생성자는 주로 속성의 초기화에 이용한다.  
		this.pass=pass;
		this.num=num; //final이지만 초기값 설정이 안되어 있을 경우 생성자를 통해 메인에서 값을 할당 
	}
	
	//4.속성의 초기화는 일반변수는 생성자가 아닌 일반 메소드로 가능하다
	//				int pass; 	public void aaa(int pass)
	
	public void aaa(int pass)
	{
		this.pass=pass;
	}
	
	
	
	
}
