package j0516;

import java.util.Random;

public class Munje9 {
    public static void main(String[] args) {
    	
    	
    	Random ran=new Random();
    	
    	// 1부터 45까지의 임의의 숫자를 출력하기  
        for(int i=1; i<=1; i++)
        {
	      int num=ran.nextInt(45)+1;
        
        System.out.print(num+" ");
   
        }
    	
    	// 101부터 190까지의 임의의 숫자를 출력하기
        for(int i=1; i<=1; i++)
        {
	      int num=ran.nextInt(90)+101;
        
        System.out.print(num+" ");
   
        }
        
    	// 10000부터 12300까지의 임의의 숫자를 출력하기
         int n=10000;
         int m=12300;
 
    	 int num=(int)(Math.random()*(m-n+1));
    	 num+=n;
    	 
    	System.out.print(num);
    	
	}
}
