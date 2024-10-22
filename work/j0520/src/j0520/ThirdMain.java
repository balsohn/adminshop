package j0520;

import java.util.Scanner;

public class ThirdMain {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		 
		Third third=new Third(); //Third를 불러오는 것. 
		
		System.out.print("1.짜장면 2.짬뽕 3.탕수육 4.전가복 : ");
		
		//변수 값 할당 
		third.chk=sc.nextInt();
		
		//메소드 실행 {}
		third.jubang();

	}

}
