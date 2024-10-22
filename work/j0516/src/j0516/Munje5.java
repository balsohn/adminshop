package j0516;

import java.util.Scanner;

public class Munje5 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받는다.
		//평균값을 구하여 콘솔창에 출력한다.
		//단. 평균값이 90점 이상이면 "참 잘했어요"라고 먼저 출력한다.
		
		Scanner sc=new Scanner(System.in);
		
	
		System.out.print("국어 성적을 입력하세요: ");
		int kor=sc.nextInt();
		System.out.print("영어 성적을 입력하세요: ");
		int eng=sc.nextInt();
		System.out.print("수학 성적을 입력하세요: ");
		int math=sc.nextInt();
		
		int aveTotal=(kor+eng+math)/3;
		
		if(aveTotal>=90) {
			System.out.println("참 잘했어요");
		}
		else {
			
		}
		
		
		
	}

}
