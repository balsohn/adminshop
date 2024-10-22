package j0514;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		// 사용자에게 원하는 메뉴를 입력받는다..
		// A.짜장면 B.짬뽕 C.우동 D.탕수육
		
		String chk;
		Scanner sc=new Scanner(System.in);
		System.out.println(" A.짜장면 B.짬뽕 C.우동 D.탕수육");

		chk=sc.next();
		
		switch(chk)
		{
		
		case "A" : System.out.println("짜장면을 주문"); break; //break를 만나면 { } 을 끝내라
		case "B" : System.out.println("짜장면을 주문"); break;
		case "C" : System.out.println("짜장면을 주문"); break;
		case "D" : System.out.println("짜장면을 주문"); break;
		default: System.out.println("잘못 입력");
		
		}
	}	

	}
