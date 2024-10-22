package j0528;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		
		//String str="학교종이 땡땡땡 어서모이자 선생님이 우리를 기다리신다";
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(); //스페이스 포함 
		
		int len=str.length(); //문자열의 길이. 배열=> 배열명.length
		System.out.println(len);
		
		
	}

}
