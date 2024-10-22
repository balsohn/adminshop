package j0516;

public class Munje7 {
    public static void main(String[] args) {
		// 1부터 100까지의 2의 배수, 3의 배수, 4의 배수의 합을 출력
    	
   
        int count2=0;
        int count3=0;
        int count4=0;
		
			for (int i=1;i<=100; i++) 
			{
			  if (i % 2 == 0) 
			  {
				count2+=i; 
			}
		
			  if (i % 3 == 0)
			{
				count3+=i;
			}

			if (i % 4 == 0) 
			{
				count4+=i; 
			}
	
			}
			System.out.println("2의 배수의 갯수 :" + count2);
			System.out.println("3의 배수의 갯수 :" + count3);
			System.out.println("4의 배수의 갯수 :" + count4);
			
		int totalSum=count2+count3+count4;
		System.out.println("2,3,4의 배수의 갯수 합은 : " + totalSum +" 입니다.");
			
	}
}
