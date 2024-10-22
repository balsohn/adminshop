package j0516;

import java.util.Scanner;

public class Munje4 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 입력받는다.
		//출력 내용 
		//"홍길동의 성적 평균은 ??점입니다";

		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name=sc.next();
		System.out.print("국어 성적을 입력하세요: ");
		int kor=sc.nextInt();
		System.out.print("영어 성적을 입력하세요: ");
		int eng=sc.nextInt();
		System.out.print("수학 성적을 입력하세요: ");
		int math=sc.nextInt();
		
		int aveTotal=(kor+eng+math)/3;
		
		System.out.println(name + "의 성적  평균은" + aveTotal + "입니다.");
		
	
	}

}
