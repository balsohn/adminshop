package Quiz;

public class TotalHap {
	//합을 저장하는 속성과 임의의 값을 저장하는 속성은
	//전역변수로 지정한다
	
	//1부터 100까지의 짝수의 합을 구해 출력하는 메소드
	
	//1~45까지의 임의의 값을 출력하는 메소드 
	
	int hap;
	int ran;
	
	public void calc() {
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			{
			hap=hap+i;
			}	
		}
		System.out.println("1부터 100까지 짝수의 합은 :" + hap);
	}
	

		//1~45까지의 임의의 값을 출력하는 메소드 
	public void calc2() {
		
		int ran=(int)(Math.random()*45)+1;
		System.out.println("1부터 45의 임의의 값은 : " + ran);
	}

}
