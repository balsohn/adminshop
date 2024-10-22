package javaChuga;

import java.nio.file.spi.FileSystemProvider;

public class MyTest {
	// 팀원이 try~catch 직접 처리
    public void ex1() { // 동작이 실행된 곳
    	
    	try
    	{
    		int num1=10;
        	int num2=0;
        	
        	int result=num1/num2;
    	}
    	catch(ArithmeticException e)
    	{
    	     System.out.println("이잉 0으로 안됑");
    	}
    }
    // ex2 메소드는 팀원이 작업 => 발생한 예외를 호출한 곳으로 떠 넘기다
    public void ex2() throws ArrayIndexOutOfBoundsException
    {
    	int[] arr=new int[6];
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*10);
    	}
    }
}
