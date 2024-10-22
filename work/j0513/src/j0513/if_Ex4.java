package j0513;

import java.util.Scanner;

public class if_Ex4 {

	public static void main(String[] args) {
		//국어 점수를 입력받은 후 점수를 출력하는 프로그램
		
		int kor;
		
		Scanner sc=new Scanner(System.in);
		
		kor=sc.nextInt();
		
		//90점 이상일 경우 "잘했어요"라는 메세지 띄우기
		
		
		if(kor>=90)
		{
			System.out.println("잘했어요!!");
		}
		else
		{
			
		}
		
		
		System.out.println("국어점수"+kor); //숫자로 더하지 못하는 것은 나열된다.
		
	

	}

}
