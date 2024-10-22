package j0522;

import java.util.Scanner;

public class Mun4Main {

	public static void main(String[] args) {
		//Scanner를 이용하여 입력할 사람의 인원수를 받으시오
		
		/*
		Scanner sc=new Scanner(System.in);
		int[] kors; 
		int n=sc.nextInt();
	
		
		kors=new int[n]; 
		System.out.println(kors.length);  
		
		m4.input();
	   */						
		
		String[] inputNames= {"무민마마","무민파파","무민","스노크메이든","스너프킨"};
		int n=inputNames.length;
		
		Mun4 m4=new Mun4(); 
		m4.init(n);  
		
		m4.input(inputNames); 
		
		
		//이름을 리턴해주는 메소드를 실행시켜서 받은 값을 출력하시오.
		//ex)당첨자 : 홍길동 

		String names=m4.getName();
		System.out.println("오늘의 당첨자 : "+names);  
		
	

		
	}
}
