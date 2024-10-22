package javaChuga;

public class ExceptionThrows {
	public static void main(String[] args) {
		
		MyTest mt=new MyTest();
		
		// 메소드를 호출한 곳
		mt.ex1();
		
		// 팀장이 작업
		try
		{
			mt.ex2();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 오벙");
		}
		System.out.println("계속되는 프로그랭");

	}

}
