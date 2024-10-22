package j0513;

import java.util.Scanner;

public class if_Ex6 {

	public static void main(String[] args) {
		// IfEx5.java에서 
		//1~3의 값이 아닌 것이 들어올 경우
		//"잘못 입력하셨습니다"라고 출력하기 
		
		
		int chk;
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("1을 입력하면 짜장면, 2는 짬뽕, 3은 우동 그외는 잘못 입력하셨습니다.");
		 chk=sc.nextInt();
		 
		 if(chk==1)
		 {
			 System.out.println("짜장면을 주문하셨습니다");
			
		 }
		
		 	 else if(chk==2)
		 	{
		 		System.out.println("짬뽕을 주문하셨습니다");
		 	}
		 		 else if (chk==3)
		 	{
		 		System.out.println("우동을 주문하셨습니다");
		 		
		 	}

		 			else {
		 	System.out.println("잘못 입력하셨습니다");
		 	
		 	}
		 
		 
	}
	
	}


