package j0514;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// 사용자에게 원하는 메뉴를 입력받는다..
		// 1.짜장면 2.짬뽕 3.우동 4.탕수육
		
		int chk;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.짜장면 2.짬뽕 3.우동 4.탕수육");
		chk=sc.nextInt();
		
		switch(chk)
		{
		case 1: System.out.println("짜장면을 주문"); break; //break => break를 만나면 { }을 끝내라 
		case 2: System.out.println("짬뽕을 주문"); break;
		case 3: System.out.println("우동을 주문"); break;
		case 4: System.out.println("탕수육을 주문"); break;
		default: System.out.println("잘못 입력"); 
			
		}
		
		
		

	}

}
