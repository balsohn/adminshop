package j0522;

public class ConstEx2 {
	
	//생성자
	//1.클래스에 필요한 속성의 초기화 
	
	int[] kors;

	//클래스에서 사용할 배열이 있다고 할때
	//사용할때마다 배열의 크기를 다르게 사용해야 된다면
	//생성자를 실행시킬때 배열의 크기를 매개변수로 받아서 생성 
	//메인 메소드에 ConstEx2 ce2=new ConstEx2(5); 값을 
	
	ConstEx2(int n) //클래스 이름과 동일한 메소드는 바로 생성자다! 
	{				//현재의 클래스는 생성자가 아닌 메소드로 초기화n를 해도 된다.
		kors=new int[n];
	}
	
	/*
	public void init(int n)
	{
		kors=new int[n];
	}
	*/
}
