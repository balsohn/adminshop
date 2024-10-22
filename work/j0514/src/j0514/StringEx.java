package j0514;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		
		String chk;
		
		Scanner sc=new Scanner(System.in);
		chk=sc.next();
		
		//chk 값이 "토끼"이면 "간을 주세요"
		//"토끼"가 아니면 "그냥 가세요"
		
		if(chk.equals("토끼")) //if(chk=="토끼")
		{
			System.out.println("간을 주세요");
		}
		else
		{
			System.out.println("그냥 가세요");
		}
		
		/*
		char 
		int
		byte
		short
		long
		float
		double
		boolean
		//보라색으로 보이는 자료형은 == 연산이 가능하다.
		String 은 == 연산이 가능은 하나 제대로 동작이 안될수 있다. 
		*/
	}

}
