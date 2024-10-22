package j0516;

public class SumEx2 {

	public static void main(String[] args) {
		//1부터 100까지의 3의 배수의 합을 구하시오.
		
		
		int hap=0;
		
		for(int i=1;i<=100;i++)  //특정조건일때만 아래문장을 실행 
		{
			if (i%3==0) //3의 배수일 경우 
			{  
				hap=hap+i;
			}
			
		}
		System.out.println(hap);
	
	}

}
