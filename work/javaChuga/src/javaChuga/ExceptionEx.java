package javaChuga;

public class ExceptionEx {
    // exception : 프로그램 실행시 발생되는 예외를 미리 처리해주는 코드
	// 예외를 처리하는 방법
	// 1. try ~ catch 구문을 통해 직접 예외를 처리
	// 2. throws 를 통해 예외를 떠 넘긴다
	
	public static void main(String[] args) {
		// 배열관련 
		int[] num=new int[5];
		
		try
		{   // 예외가 발생할 코드를 try문에 넣는다.
			for(int i=0;i<=num.length;i++)
			{
				num[i]=100;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) // 괄호문에 예상되는 예외를 추가한다.
		{
			  e.getMessage(); // 이 메시지를 관리자가 실시간으로 볼수 있는 모니터에 나타내기
		}
		
		System.out.println(num[2]);
		System.out.println("계속되는 프로그램");
		System.out.println("출력하기");
		
	}
	
}
