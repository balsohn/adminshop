package j0516;

import java.util.Scanner;

public class Munje10 {
    public static void main(String[] args) {
		// n의 값을 콘솔로 입력 받은 후 
    	// 1부터 n까지의 임의의 숫자를 출력하기
    	
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	
    	int num;
        num=(int)(Math.random()*n)+1;
        
        System.out.println(num);
		
         }
}
