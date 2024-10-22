package javaChuga;

public class ExceptionMulti2 {
    public static void main(String[] args) {
    	try
    	{   // 예외가 발생되는 코드를 하나의 try에 전부 넣는다
    		
    		int a1=100;
        	int b1=0;
        	int c=a1/b1;
    		
    		String str=null;
        	String str2="ㅎㅎㅎ";
        	
        	if(str.equals(str2)) 
        	{
        		System.out.println("같다");
        	}
        	else
        	{
        		System.out.println("다르다");
        	}
        	
        	int[] num=new int[5];
        	num[5]=100;
        	
        	String chk="";
        	int a=Integer.parseInt("chk");
        	
        	
        	
    	}   // try에 1개 이상의 예외가 발생시  catch문을 여러개 적을수있다
    	catch(NullPointerException e) 
    	{
    		e.printStackTrace();
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		e.printStackTrace();
    	}
    	catch(NumberFormatException e)
    	{
    		e.printStackTrace();
    	}
    	catch(Exception e) // 예측하지 못하는 예외발생시 처리방법 => error.jsp
    	{
    		e.printStackTrace();
    	}
    			
    	
    	System.out.println("계속되는 프로그램");
		System.out.println("출력하기");
	}
}
