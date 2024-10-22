package j0516;

import java.util.Arrays;
import java.util.Random;

public class Munje12 {

	public static void main(String[] args) {
		// 1부터 45까지의 임의의 숫자를 6개 출력하기
		// 단. 중복되는 값이 나오지 않게한다 (이것은 배우지 않았지만 한번 찾아보라는 의미입니다)
		// 너무 오래 찾지는 마시고 조금 찾다가 잘 안되면 쉬세요. 다음주 월요일에 할거니까

		int[] lotto=new int[6];			//배열 lotto [i]  outter 
		
		for(int i=0; i<lotto.length; i++) //인덱스0~5까지 
		{
			lotto[i]=(int)(Math.random()*45)+1; //1~45까지 랜덤숫자를 배열에 대입한다. 
			
			for(int j=0; j<i;j++)			//비교값 저장 배열lotto [j] inner 
			{
			   if(lotto[j]==lotto[i])			//중복이라면 
			  {
				i--;							//i에서 1을 빼고 outter loop lotto[i]실행 
			   break;
			  }
			}
		
		}
		
		Arrays.sort(lotto);
		
		for(int i=0; i<lotto.length; i++)
		{
			System.out.print(lotto[i]+ " ");
		}
	     
		
		
	}
}
