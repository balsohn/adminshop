package j0513;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
	
		//두개의 숫자를 입력받는다
		//사용자로부터 1:더하기 2:빼기 3:곱하기 4:나누기
		//4개의 숫자를 입력을 받아서 두개의 숫자를 산술연산하는 프로그램을 작성하시오.
		
		
		int num1, num2;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("1번 값을 입력하세요: ");
		num1=sc.nextInt();
		System.out.println("2번 값을 입력하세요: ");
		num2=sc.nextInt();
		
		int chk;
		System.out.println("1:더하기 2:빼기 3:곱하기 4:나누기 중 선택하세요");
		chk=sc.nextInt();
		
		if(chk==1) {
			System.out.println("더하기 값은 : " +(num1+num2) + "입니다");   
		}
			else if(chk==2) {
			System.out.println("빼기 값은 : " + (num1-num2) + "입니다");
		}
		
			else if(chk==3) {
				
			System.out.println("곱하기 값은 : " + (num1*num2) + "입니다");
		}
		
			else if(chk==4) {
			System.out.println("나누기 값은 : " + (num1/num2) + "입니다");	
		}
			else {
				
		
			}
		

	}

	
}
