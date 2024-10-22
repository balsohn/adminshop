package j0516;

public class Munje13 {
    public static void main(String[] args) {
		// 1부터 100까지의 임의의 숫자를 50번 발생시켜서 합을 구하여 출력하기
    	
    	// 1부터 100까지의 임의의 숫자를 50번 발생시키고 3의 배수의 합만 구하기
    	
    	// 위의 두문제를 따로 하셔도 되고 같이 하셔도 됩니다.(for문)
    
 
    	int sum=0;
    	
    	for(int i=1; i<=50; i++)
    	{
    		int ran=(int)(Math.random()*100)+1;
    		if(ran%3==0) {
    			sum=sum+ran;
    		}
    		
    	}
    	 System.out.println(sum);
    
 		
}
}
