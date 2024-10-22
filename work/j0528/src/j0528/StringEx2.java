package j0528;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		
		//콘솔창에 입력된 이메일을 아이디, 서버주소를 분리하여 출력하시오
		
		Scanner sc=new Scanner(System.in);
		String email=sc.next();
		int len=email.length();
		System.out.println("Total Length of email: "+ len);
		
		int n=email.indexOf("@");
		
		String userID=email.substring(0, n);
		System.out.println("ID : " +userID );
		
		String Server=email.substring(n+1);
		System.out.println("Server : "+ Server);

	}

}
