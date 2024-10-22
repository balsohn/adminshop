package j0524;

public class MethodEx {

	//[1]클래스의 메소드
	//1.매개변수 : 메소드 실행시 필요한 값
	//2.리턴값  : 메소드 실행후 발생된 값을 호출한 곳으로 전달  
	
	//두 개 이상의 메소드에서 사용할 경우 클래스에서 선언 
	int hap; 
	
	
	//1.두수의 합을 구하는 메소드
	//  두수는 메소드에서 생성을 못한다 
	//  ()안에 매개변수를 생성 
	public void hap(int a, int b) 
	{
		int hap=0;
		hap=a+b;
		System.out.println("합 : "+hap); //출력 후 입력된 값은 삭제된다. 
	}
	
	//2.리턴을 사용하는 메소드 
	public  int hap2(int a, int b)
	{	
		int hap=0;
		hap=a+b;
		return hap; //발생된 값을 메인 메소드에(호출한 곳) 보낸다. 값이 저장된다.  
		
	}
	
}
