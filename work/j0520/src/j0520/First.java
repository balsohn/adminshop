package j0520;

public class First {
		
		//두 수의 산술연산을 하는 명령서 
		//값을 미리 설정하지 않은 기본 레시피
	
		//명령서를 실행할 클래스에만 main메소드를 입력한다. 
		//개별적으로 원하는 값을 넣어서 실행시키기 위해 .
	
		//속성 선언
		int num1,num2; //default는 생략해도 같은 패키지 않에서 클래스 공유. 
		
		
		//더하기 메소드 
		public void add()
		{
			System.out.println(num1+num2);
		}
		//빼기
		public void sub()
		{
			System.out.println(num1-num2);
		}
		//곱하기
		public void mul()
		{
			System.out.println(num1*num2);
		}
		//나누기 
		public void div()
		{
			System.out.println(num1/num2);
		}
	

}
