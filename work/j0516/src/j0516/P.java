package j0516;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {
	
		
		/*
		int evensum=0;
		int oddsum=0;

	
		for (int i=1; i<=100; i++)
		{
			if(i%2==0)
			{
				evensum=evensum+i;
			}
			
			else 
			{
				oddsum=oddsum+i;
			}
			
		}
			int totalSum= evensum + oddsum;
			
			System.out.println(totalSum);
			
			
			*/
		
			//ArrayEx2.
		
			int[] nums=new int[5];
			nums[0]=11;
			nums[1]=22;
			nums[2]=33;
			nums[3]=44;
			nums[4]=55;
		
		
			//배열 기본 공식 
			
			Scanner sc=new Scanner(System.in);
			
			for (int i=0; i<=4; i++)
			{
				nums[i]=sc.nextInt();
			}
			
			for (int i=0; i<=4; i++)
			{
				System.out.println(nums[i]);
			}
		
			//?- num0~4의 값을 입력하여 11~55의 값을 출력하기.. 
			
	
		
			//ArrayEx3.
			
		   // 변수이름.length
		/*
			int[] 변수이름=new int[갯수];
			
			for (int i=0; i<=갯수-1); i++) <= 갯수를 동일하게 입력할 경우 오류남.ex5참고 
			{
				변수명[i]=99;
				
			}
			for (int i=0; i<변수명.length; i++)
			{
				System.out.println(변수명[i]);
			}
		*/
			

		}
		
}

