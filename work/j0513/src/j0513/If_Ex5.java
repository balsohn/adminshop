package j0513;

import java.util.Scanner;


public class If_Ex5 {

	public static void main(String[] args) {
		// 실행할 내용이 3개가 있다.
		//입력받는 변수 : chk 
		// 1을 입력하면 짜장면, 2는 짬뽕, 3은 우동 
		
		
		int chk;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1을 입력하면 짜장면, 2는 짬뽕, 3은 우동");
		chk=sc.nextInt();
		
		if(chk==1)
		{
			System.out.println("짜장면을 주문하셨습니다");
		}
		
			else if(chk==2)
				{
			System.out.println("짬뽕을 주문하셨습니다");
				}
		
				else 
				{
				System.out.println("우동을 주문하셨습니다");
				}
		
		
		
	}

}
