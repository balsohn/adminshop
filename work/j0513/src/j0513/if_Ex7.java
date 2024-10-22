package j0513;

import java.util.Scanner;


public class if_Ex7 {

	public static void main(String[] args) {
		// 국어점수를 입력받는다
		// 수,우,미,양,가로 출력하시오
		
		
		int chk;
		char student;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("성적을 입력하세요 : ");
		chk=sc.nextInt();
		
		if (chk>=90)
		{
		System.out.println("수");
		student = 'A';
	
		}
		   else if(chk>=80)
		   {
			System.out.println("우");
			student = 'B';
		   }
		   	else if(chk>=70)
		    {
			 System.out.println("미");
			 student = 'C';
		    }
		   		else if(chk>=60)
		        {
			     System.out.println("양");
			     student = 'D';
		        }
		   		   else
		   			{
		   			 System.out.println("가");
		   			student = 'E';
		   			}

		System.out.println(student+"의 성적은"+" "+chk +"점 입니다");

	}

}
