package j0516;



public class SumEx3 {

	public static void main(String[] args) {
		// 짝수의 합과 홀수의 합을 구하시오
	
		/* int sum=0; */ //결과값을 도출받을 변수를 설정하지 않아도 2개의 결과값의 합을 구할 수 있음 

		int even=0; //짝수 저장 
		int odd=0; //홀수 저장 
	
		
		for (int i=1; i<=100; i++)
		{
			if (i%2==0)
			{
				even=even+i;  //짝수의 합 	
			}
			else  			  //else문의 조건식을 쓰지 않는다. 
			{   
				odd=odd+i;   //홀수의 합 
			}
		}
			
			/*System.out.println(sum); */ //제3의 변수를 설정하지 않기 때문에 
			System.out.println(even+" "+odd);
			


	}

}
