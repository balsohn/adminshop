package j0521;

import java.util.Date;

public class MethodEx1Main {

	public static void main(String[] args) {
		
		
		MethodEx1 me1=new MethodEx1();
		
		//날짜를 매개변수로 보낸다
		Date today=new Date(); //util.Date 꼭 양쪽 다 추가 
		
		me1.chul(today);
		
		
		int[] lotto=new int[6];
		for(int i=0; i<lotto.length; i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
		}
		
	me1.lottoView(lotto);
	System.out.println(); //줄바꿈
	
		for(int i=0; i<lotto.length; i++)
		{
			System.out.print(lotto[i]+" ");
		}
		
		
		me1.hap1();
		
		//호출하는 곳에서 값을 전달할 수 있다(매개변수parameter)
		
		me1.hap2(50); //hap2(int n) 자료형 n값 
		
		me1.hap3(5, 20);//hap3(int a, int b) 자료형 a,b값 순서대로 
		
		/*
		//매개변수가 존재하는 메소드는
		//무조건 자료형과 갯수를 맞게끔 값을 전달해야 한다.
		me1.hap2(); //입력을 안한 경우 
		me1.hap2("하하하"); //자료형이 다를 경우 
		me1.hap3(11,33,44); //매개변수의 갯수와 다를 경우 
		*/
		
		
		//자료형이 다를경우에도 순서를 지키면 된다 
		me1.imsi(true, "홍길동", 22);
		me1.imsi(false, "슈퍼맨", 15);
		//me1.imsi("배트맨", true, 20); 자료형 순서에 맞게 작성 
		
	
		
	}
}
