package j0516;

import java.util.Scanner;

public class Munje2 {

	public static void main(String[] args) {
		//국어 성적을 입력받는다.
		//A,B,C,D,F로 성적을 출력한다.
		
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요: ");
		int kor=sc.nextInt();
	     
		if(kor>=90)
		{
			System.out.println("국어 성적은 : " + "A" + "입니다.");
		}
			else if(kor>=80)
		{
			System.out.println("국어 성적은 : " + "B" + "입니다.");
		}
			else if(kor>=70)
			{
			 System.out.println("국어 성적은 : " + "C" + "입니다.");
			}
			else if(kor>=60)
			{
				System.out.println("국어 성적은 : " + "D" + "입니다.");
			}
			else
			{
				System.out.println("국어 성적은 : " + "F" + "입니다.");
			}

	}

}
