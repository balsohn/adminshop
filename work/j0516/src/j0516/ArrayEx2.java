package j0516;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		//5개의 정수를 지정하여 저장하기 
		//변수 
		int a,b,c,d,e;
		a=11;
		b=22;
		c=33;
		d=44;
		e=55;
		
		//배열
		int[] nums=new int[5];
		nums[0]=11;
		nums[1]=22;
		nums[2]=33;
		nums[3]=44;
		nums[4]=55;
		
		
		Scanner sc=new Scanner(System.in);
		// 5개의 정수를 저장하기 => 콘솔창
		//변수 
		//a=sc.nextInt();
		//b=sc.nextInt();
		//c=sc.nextInt();
		//d=sc.nextInt();
		//e=sc.nextInt();
		
		//배열
		for (int i=0; i<=4;i++) // i의 값만 설정 바꾸면 됨 
		{
			nums[i]=sc.nextInt();
		}
		//출력 
		for (int i=0; i<=4;i++)
		{
			System.out.println(nums[i]);
		}
		
		/*
		nums[0]=sc.nextInt();
		nums[1]=sc.nextInt();
		nums[2]=sc.nextInt();
		nums[3]=sc.nextInt();
		nums[4]=sc.nextInt();
	
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		*/
	}
}
