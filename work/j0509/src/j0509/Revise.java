package j0509; /* 패키지 자동 생성됨. 현재 프로젝트의 어떤 폴더내에 존재하는가 */

import java.util.Scanner;

/* 숫자로 명명할 경우 default package 즉 패키지없음으로 생성되어 패키지명이 나타나지 않음.*/

public class Revise { /*  {} 중괄호로 명령서 시작을 알림.*/

	public static void main(String[] args) {  /* 시작을 알리는 main 함수(메소드), 고정. class 당 한개 필수*/
		// TODO Auto-generated method stub

		// System.out.println <- 줄바꿈 있음 
		// System.out.print   <- 줄바꿈 없음 
		System.out.println("안녕!");
		System.out.println("잘 가");
		System.out.println("=============");
		System.out.print("Hello!");
		System.out.println("Bye");
		/* 변수: 값을 저장할 수 있다. 값은 변할 수 있다. */
		/* 변수 종류 : 문자열, 문자, 정수, 실수, 논리값 */
		
		
		
		/*	  정수         */
	//	int num= ; 정수를 저장하는 num이라는 변수를 선언
		
		int num3=88;
		System.out.println(num3);
		
		/*byte    1 
		  short   2
		  int     4    <- 수업에선 integer만 사용. 동시접속자 수가 많은 사이트는 모두 사용. 
		  long    8
		 
		 */
		
		/*	  실수         */
		//double (8byte)
		//float (4byte) 
		
		//float num1
		//double num2 
		//num1=12.3
		//num2=12.3F
		
		/*	  문자, 문자열         */
		char aa;
		//string bb; 
		
		/*	  논리형         */
		//true
		//false
		
		/*	 선언과 할당을 같이 할 때        */
	//	int num=88; 
		//char b='아'
	
				
				/*	 Scanner         */
		Scanner sc=new Scanner (System.in);   //sc는 변경가능. 나머지는 고정. 
		sc.next(); // 문자를 입력받는 기능 
		sc.nextInt(); // 숫자를 입력받는 기능 
		
		//콘솔창에 입력. 우측값이 좌측으로 보내짐. 
	   String name=sc.next(); //문자.
	   int age=sc.nextInt();//숫자.
	   //출력 
	   System.out.println(name);
	   System.out.println(age);
	   
	   
		
		
		
		
		
	}

	
	
	
	
}
