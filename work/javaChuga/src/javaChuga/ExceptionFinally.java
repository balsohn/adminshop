package javaChuga;

public class ExceptionFinally {
    public static void main(String[] args) {
		
    	try
    	{
	    	int num1=100;
	    	int num2=0;
	    	
	    	int result=num1/num2;
    	}
    	catch(ArithmeticException e)
    	{
    		e.printStackTrace();
    	}
    	finally // 예외가 발생하거나 하지 않거나 관계없이 실행되는 영역
    	{       // finally는 try구분에 실행되는 부분의 연속이라 본다
    		System.out.println("finally입니다");
    	}
    	/////////////////////////////////////////////
    	System.out.println("계속 진행되는 프로그램");
	}
}



