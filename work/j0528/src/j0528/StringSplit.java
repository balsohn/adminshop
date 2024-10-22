package j0528;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		//StringSplit ("구분자")
		//문자열을 구분자로 하여 나눈뒤 배열에 저장하는 메소드 
		
		Scanner sc=new Scanner(System.in);
		String email=sc.next();
		
		String[] emails=email.split("@");
		System.out.println(emails[0]);
		System.out.println(emails[1]);
		
		String phone=sc.next();
		String[] phones=phone.split("-");
		
	
		System.out.println(phones[0]);
		System.out.println(phones[1]);
		System.out.println(phones[2]);
	}

}
