package j0516;

import java.util.Scanner;

public class Munje6 {

	public static void main(String[] args) {
		// 두 개의 계산을 위한 숫자를 입력받는다.
		// 두 개의 값을 연산할 값을 입력받는다.
		// (1:더하기, 2:빼기, 3:나누기, 4:곱하기)
		//입력받은 값에 따라 두수의 연산값을 출력한다.
		// if문과 switch문 둘 다 해봅니다. 

		Scanner sc=new Scanner(System.in);
		
		System.out.print("a값을 입력하세요: ");
		int a=sc.nextInt();
		System.out.print("b값을 입력하세요: ");
		int b=sc.nextInt();
		
		
		System.out.print("다음중 선택 하세요 - 1:더하기, 2:빼기, 3:나누기, 4:곱하기");
		int chs=sc.nextInt();
		
		if(chs==1) {
			System.out.println("더하기 값은 :" + (a+b)+"입니다.");
		}
		if(chs==2) {
			System.out.println("빼기 값은 :" + (a-b)+"입니다.");
		}
		if(chs==3) {
			System.out.println("나누기 값은 :" + (a%b)+"입니다.");
		}
		if(chs==4) {
			System.out.println("곱하기 값은 :" + (a*b)+"입니다.");
		}
		
	
		
		
	}

}
