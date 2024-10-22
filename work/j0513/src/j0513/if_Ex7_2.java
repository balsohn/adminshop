package j0513;

import java.util.Scanner;


public class if_Ex7_2 {

	public static void main(String[] args) {
		
		int kor;
		Scanner sc=new Scanner(System.in);
		kor=sc.nextInt();
		
		if(kor>=90)
		{
			System.out.println("수");
		}
			else if(kor>=80)
		{
			System.out.println("우");
		}
			else if(kor>=70)
			{
			 System.out.println("미");
			}
			else if(kor>=60)
			{
				System.out.println("양");
			}
			else
			{
				System.out.println("가");
			}

	}

}
