
package j0516;
import java.util.Random;

public class Munje15 {
    public static void main(String[] args) {
		// 1부터 10까지의 숫자 하나를 변수에 저장한다.
    	// 임의의 수를 1부터 10까지 10번 발생시켜서
    	// 위의 변수에 저장된 수와 일치하는 값이 몇번인지 출력
    	
    /*
    			int target=(int)(Math.random()*10)+1; 	//1부터 1부터0까지 숫자를 하나의 변수에 저장 
    			
    		
    			int match=0;   							//일치하는 값의 횟수를 세기 위한 변수 초기화 
    			
    			for(int i=1; i<=10; i++) {					   //1부터 10까지의 임의의 숫자 생성 								
    				int random=(int)(Math.random()*10)+1;     //생성된 숫자 출력 random 출력 										
    				System.out.println("random"+(i)+": "+random);  
    													
    				if (random==target) {			    //생성된 숫자가  target와 일치하는지 확인 
    					match++;						//일치하는 경우 match증가 
    				}
    			}
    			
    			System.out.println("Target number: " + target);
    	        System.out.println("Number of matches: " + match);
    	*/
    	
    	int num=8;
    	int bun=0;
    	
    	for(int i=1; i<=10; i++)
    	{
    		int chk=(int)(Math.random()*10)+1;
    		if(chk==num) {
    			bun++;
    		}
    	}
    	
    	System.out.println("매치한 횟수 : "+ bun);

	}
}
