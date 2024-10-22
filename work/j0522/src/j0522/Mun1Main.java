package j0522;

import java.util.Scanner;

public class Mun1Main {

	public static void main(String[] args) {
		
		Mun1 m1= new Mun1();
		
		Scanner sc=new Scanner(System.in);
		
		//[1]
		System.out.print("성적을 입력하세요 : ");
		int bb=sc.nextInt();
		
		String aa=m1.check(bb);	//사용할 목적으로 리턴값을 받아서 print로 출력
		System.out.println(aa);
		System.out.println("======================");
		//[2]
		
		int num=m1.randomNumber(1, 10);
		System.out.print("a부터 b사이의 랜덤값은 : "+num);
		
		System.out.println(" ");
		
		//[3]
	
		System.out.println("======================");
		System.out.print("a의 값을 입력하세요: ");
		int a1=sc.nextInt();
		System.out.print("b의 값을 입력하세요: ");
		int b1=sc.nextInt();
		m1.hap2(a1, b1);
		//int hap=m1.hap2(100,1);
		
		//[4]
		/*
		System.out.print("국어점수를 입력하세요 : ");
		int a2=sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int b2=sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int c2=sc.nextInt();
		m1.input(a2, b2, c2);
		*/
		
		int[] sungs=m1.sungjuk(80, 90, 70);
		System.out.println("합계 :" +sungs[0]);
		System.out.println("평균 :" +sungs[1]);
	
		
	}
}
