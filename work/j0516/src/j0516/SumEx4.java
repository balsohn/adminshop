package j0516;

import java.util.Scanner;

public class SumEx4 {

	public static void main(String[] args) {
		// a부터 b까지의 합을 구하시오
		
		//콘솔창에서 a,b의 값을 입력
		//int a,b,hap;
		
		int a;
		int b;
		int hap=0;   //제3의 변수는 값을 초기값을 설정하여 a+b의 결과값을 받을 수 있도록한다. 
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		for (int i=a; i<=b; i++)
		{
			hap=hap+i;
		}
		
		System.out.println(hap);

	}

}
