package j0520;

import java.util.Scanner;

public class FourthMain {

	public static void main(String[] args) {
	
		//Scanner sc=new Scanner(System.in); //스캐너 
		
		Fourth fourth=new Fourth(); //입력받을 스캐너 
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		fourth.day=sc.nextInt(); //기존 클래스의 이름이 아닌 스캐너로 새로 입력받는 객체변수명 입력 
		
		fourth.today();
	
	}

}
