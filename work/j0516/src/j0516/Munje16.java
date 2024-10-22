package j0516;

public class Munje16 {
    public static void main(String[] args) {
		// 반복문을 이용하여 "즐거운 주말이예요"를 출력한다.
    	// while문을 이용하여 처리한다.
    	// 반복문 한 번 실행시 임의의 숫자(1~45)를 발생
    	// 임의의 숫자가 7일 경우 반복문을 종료한다.
    	/*
	 while(true) {
		 int number=(int)(Math.random()*45)+1;
		 System.out.println("즐거운 주말이예요"+number);
		 if(number==7) {
			 break;
		 }
	 }
	     System.out.println("반복문 종료");
	     
	    */
    	/*
    	int num=(int)(Math.random()*45)+1;
    	
    	
    	while(num!=7)
    	{
    		System.out.println("즐거운 주말이예요"+num);
    		num=(int)(Math.random()*45)+1;
    	}
    	
    	*/
    	
    	while ((int)(Math.random()*45)+1 != 7)
    	{
    		System.out.println("즐거운주말이예요");
    	}
    	
    	
    	
	}
}
