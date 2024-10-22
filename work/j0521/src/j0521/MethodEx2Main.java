package j0521;

import java.util.Scanner;

public class MethodEx2Main {

	public static void main(String[] args) {
	
		MethodEx2 me2=new MethodEx2();
		
		//리턴값이 존재하는 메소드에서 보내는 값을 가져오기
		//가져온 값을 저장을 하면 프로그램 종료까지 접근이 가능 
		int hap=me2.hap();
		System.out.println("합 : "+hap);
		me2.hap2();
		
		//리턴되는 자료형과 저장하는 자료형이 틀리면 오류 
		//char imsi=me2.hap();
		//boolean aa=me2.hap();
		
		Scanner sc=new Scanner(System.in);
		int kor=sc.nextInt();
		String name=sc.next();
	}

}
