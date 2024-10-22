package javaChuga;

public class ExceptionEx2 {
    public static void main(String[] args) {
		
    	try
    	{
    		String num="dd";
        	
        	int a=Integer.parseInt(num);
        	System.out.println(a);
    	}
    	catch(NumberFormatException e)
    	{ // catch문의 Exception의 종류가 틀리면
    		// 그대로 오류가 난다
    		e.printStackTrace();
    	}
    	
    	System.out.println("계속되는 프로그램");
		System.out.println("출력하기");
	}
}
