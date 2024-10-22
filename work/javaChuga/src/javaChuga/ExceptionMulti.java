package javaChuga;

public class ExceptionMulti {
    public static void main(String[] args) {
		
    	try
    	{
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
    	}
    	catch(NullPointerException e)
    	{
    		e.printStackTrace();
    	}
    	
    	try
    	{
    		int[] num=new int[5];
        	num[5]=100;
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		e.printStackTrace();
    	}
    	
    	try
    	{
    		String chk="";
        	int a=Integer.parseInt("chk");
    	}
    	catch(NumberFormatException e)
    	{
    		e.printStackTrace();
    	}
    		
    	
    	System.out.println("계속되는 프로그램");
		System.out.println("출력하기");
	}
}
