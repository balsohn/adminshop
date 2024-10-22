package j0516;

public class SumEx1 {

	public static void main(String[] args) {
		// 여러개의 값을 더하기 
		// 1부터 5까지의 합을 구하시오 
		
		//int hap=1+2+3+4+5;
		
		int hap=0;
		
		/*
		hap=hap+1;  // hap=1; <- 같은 공식으로 변경. hap=0 기초값을 넣어준다. 
		hap=hap+2;
		hap=hap+3;
		hap=hap+4;
		hap=hap+5;
		*/
		
		for( int i=1;i<=5;i++)
		{
			hap=hap+i;
		}

			System.out.println("합 : "+hap);
				
			
		}
	
	}


