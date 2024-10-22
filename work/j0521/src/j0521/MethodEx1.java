package j0521;

import java.util.Date;

public class MethodEx1 {
	//메소드는 실행이 끝나면 메소드 내의 모든 내용은 사라진다. 
	//메소드 : 동작을 실행하는 것으로 동작을 위해 필요한 값 => 매개변수 
	//		 동작을 완료한 이후에 발생된 값을 이용하고자 하는 경우 => 리턴값 
	
	
	//매개변수에 사용할 수 있는 것은 자료형 뿐만 아니라
	//모든 객체가 가능하다. new연산자. 배열. Date. 

	public void chul(Date today)
	{
		System.out.println(today.getDate());
	}
	
	
	public void lottoView(int[] lotto)
	{
		for(int i=0; i<lotto.length; i++)
		{
		System.out.print(lotto[i]+" ");
		}
	}
	
	public void hap1()
	{
		int hap=0;
		//1부터 100까지의 합을 구한다
		for (int i=0; i<=100; i++)
		{
			hap=hap+i;
		}
		System.out.println(hap);
	}
	
	
	//매개변수명은 현재 메소드내에서 사용하는 이름으로 받는다
	public void hap2(int n)//main에서 값을 받을 자료형+ 변수명
	{					//n값을 발생시키지 못한다 
		int hap=0;
		//1부터 n까지의 합을 구한다 
		for(int i=0; i<=n; i++)
		{
			hap=hap+i;
		}
		System.out.println(hap);
	}
	
	public void hap3(int a,int b)
	{				//int a=5, int b=20
		int hap=0;
		//a부터 b까지의 합을 구한다
		for (int i=a; i<=b; i++)
		{
			hap=hap+i;
		}
		System.out.println(hap);
		
	}
	
	
	public void imsi(boolean chk, String name, int age)
	{
		if(chk){  //비교연산자 or (true or false)
			System.out.println(name+"은 통과");
		}
		else
		{
		System.out.println(name+"은 뒤돌아 가세요");
		}


		
		
	}
}

