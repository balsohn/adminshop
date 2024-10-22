package j0514;

public class RandomEx {

	public static void main(String[] args) {
		//임의의 수 
		//1970년 1월 1일 0시 기준으로 지금까지의 1/1000초 
		
	
		long num=System.currentTimeMillis();
		
		//System.out.println(num);
	
		
		//num변수의 값으로 1~45까지의 임의의 수 만들기
		//num의 값을 45로 나누면 나머지는 ? => 0~44 => +1
		
		long lot=num%45; //0~44 
		lot=lot+1; // 1~45
		
		System.out.println(lot);
		System.out.println("----------------------");
		
		for(int i=1;i<=6;i++)
		{	
		num=System.currentTimeMillis();        //같은 값의 수가 실행된다. 연속적인 랜덤 숫자를 구할 때 부적절.  
		lot=num%45;
		lot=lot+1;
		
		System.out.print(lot+"  ");
		}
	

	}

}
