package javaChuga;

public class ExceptionEx3 {
    public static void main(String[] args) {
		
    	try
    	{
    		String str=null;
        	String str2="하하하";
        	
        	if(str.equals(str2)) 
        	{
        	    System.out.println("같다");	
        	}
        	else
        	{
        		System.out.println("다르다");
        	}
    	}
    	catch(NullPointerException e)
    	{
    		e.printStackTrace();
    	}
    	
    	System.out.println("계속되는 프로그램");
		System.out.println("출력하기");
    	
	}
}
