package j0514;

public class Test1 {

	public static void main(String[] args) {
		// 1부터 100까지 3의 배수의 갯수를 구하시오
		
		//프로그래밍에서 배수를 구한다 => %을 이용 => 나머지가 0이면 배수 
		
		int count = 0;
		
		for (int i=1;i<=100; i++) {
			
			if (i % 3 == 0) {
				
				count=count+1; //초기값을 설정하지 않을 경우 오류가 난다. 
			
			/*count ++; */	
			
			}
		}
		
			System.out.println("3의 배수의 갯수 :" + count);
		
	
	}
}
