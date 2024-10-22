package j0516;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		
		//a에서 b까지의 합을 출력하시오
		//단 a값이 b보다 큰값이 들어와도 계산하기
		
		Scanner sc=new Scanner(System.in);
		
		//int a,b,sum=0;
		
		System.out.print("A값은: ");
		int A=sc.nextInt();
		
		System.out.print("B값은: ");
		int B=sc.nextInt();
		
		int sum=0;
		/*
		int start=Math.min(A,B);
		int end=Math.max(A,B);
		
		for (int i=start; i<=end; i++)
		{
			sum+=i;
		}
		*/
		
		//a가 b보다 클때 값을 교환 conditional Swap
		
		  if(A>B) 
		{
			
			//변수를 교환하는 코드 
			int C;
			C=A;
			A=B;
			B=C;
		}
		
		for (int i=A; i<=B; i++)
		{
			sum=sum+i;
		}
		System.out.println(A+"부터"+B+"의 합은"+sum+"입니다.");	
		
		
	}

}
