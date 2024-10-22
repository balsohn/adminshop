package j0520;

import java.util.Scanner;

public class SecondMain {

	public static void main(String[] args) {
		//Second 클래스 사용하기
		
	
		Second second=new Second();
		
		//속성(변수) 값 입력. 나이를 입력
		Scanner sc=new Scanner(System.in); 
		System.out.print("나이를 입력하세요: ");
		second.age=sc.nextInt(); //Second 클래스에   int age; 초기값0으로 선언됨. 
								//옵션default(생략) 자료형int 속성명age  
		//스캐너로 입력값 받기 Second 클래스에 변수선언이 되어있기 때문에 따로 선언을 할 필요없이 바로second.-원하는 변수 입력
		
		
		//Second 클래스에 입력된 메소드명령서 
		second.check(); // public void check() {if-else문을 활용해서 설정값에 따라 다른 답변을 출력} 
						//						{실행할 명령서}
		

	}

}
