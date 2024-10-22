package j0522;

import java.util.Scanner;

public class Mun2Main {

	public static void main(String[] args) {
		// Mun2 클래스 객체생성해서 실행 
	

		Scanner sc=new Scanner(System.in);
		System.out.print("1~3을 입력하세요: ");
		int n=sc.nextInt();
		
		Mun2 m2=new Mun2();
		m2.isCheck(n);

		
	}

}
