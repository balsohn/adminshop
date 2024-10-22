package j0516;

import java.util.Scanner;

public class Munje8 {
    public static void main(String[] args) {
	// n의 값을 콘솔창으로 입력받고 1부터 n까지의 합을 구하기
    	
    	Scanner sc=new Scanner(System.in);
    	
    	int a=1;
    	int total=0;
    	
    	System.out.print("n값을 입력하세요: ");
    	int n=sc.nextInt();
    	
    	for(int i=a;i<=n;i++)
		{
			total=total+i;
		}

    	System.out.println("1부터 n까지의 총합은:" + total + "입니다.");
 	
	}
}
