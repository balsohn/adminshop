package j0513;

import java.util.Scanner;

public class Numcheck {

	public static void main(String[] args) {
		// 숫자를 입력받는다
		
		//입력된 숫자가 홀수인지 짝수인지 출력하시오 
		
		
 int chk;
 
Scanner sc=new Scanner(System.in);

chk=sc.nextInt();


if(chk%2==0) {
	System.out.println("짝수입니다.");
}

else {
	System.out.println("홀수입니다.");
}


	}

}
