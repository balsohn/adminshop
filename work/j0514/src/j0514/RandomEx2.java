package j0514;

public class RandomEx2 {

	public static void main(String[] args) {
	//  임의의 수를 위한 라이브러리
		
		// 1. java.lang.Math.random()
		
		for(int i=1;i<=6;i++)
		{
			double num=Math.random(); // 0~1 사이의 실수
			
			int ran=(int)(num*100000); // 0~1000000사이의 정수
			//() 괄호 우선순위. num*10000괄호가 없으면 앞에 (int)num을 우선순위로 계산해서 0이 출력. 
			
			ran=ran%45; // 0~44의 정수
			ran=ran+1;  // 1~45의 정수
			
			System.out.print(ran+" ");
		}
	



}
}