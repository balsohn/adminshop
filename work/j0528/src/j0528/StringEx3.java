package j0528;

import java.util.Scanner;

public class StringEx3 {
	public static void main(String[] args) {
		
		//전화번호를 "-"이 포함되게 입력한다.
		//전화번호의 "-"을 이용하여 
		//앞자리, 중간자리, 뒷자리 번호를 출력하시오 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("전화번호 : ");
		String phone=sc.next();
		
		int n=phone.indexOf("-");
		int m=phone.lastIndexOf("-");
		System.out.println(n+" "+m);
		//첫번째 -위치와 마지막 - 위치 
		
		String a=phone.substring(0, n);
		System.out.println("앞번호  : " +a);
		
		String b=phone.substring(n+1, m);
		System.out.println("중간번호 : "+b);
		
		String c=phone.substring(m+1);
		System.out.println("끝번호  : "+c);
		
	}
}
