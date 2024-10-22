package j0516;

import java.util.Scanner;

public class Munje3 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 성적을 입력받는다.
		//평균의 값으로 A,B,C,D,F로 성적을 출력한다. 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("국어 성적을 입력하세요: ");
		int kors=sc.nextInt();
		System.out.print("영어 성적을 입력하세요: ");
		int eng=sc.nextInt();
		System.out.print("수학 성적을 입력하세요: ");
		int math=sc.nextInt();
		
	
		System.out.println("세 과목의 합계평균은 : " + (kors+eng+math)/3 + "입니다." );
	     
		int sum=(kors+eng+math)/3;
		
		if(sum>=90)
		{
			System.out.println("성적은 : " + "A" + "입니다.");
		}
			else if(sum>=80)
		{
			System.out.println("성적은 : " + "B" + "입니다.");
		}
			else if(sum>=70)
			{
			 System.out.println("성적은 : " + "C" + "입니다.");
			}
			else if(sum>=60)
			{
				System.out.println("성적은 : " + "D" + "입니다.");
			}
			else
			{
				System.out.println("성적은 : " + "F" + "입니다.");
			}
		
	}

}
