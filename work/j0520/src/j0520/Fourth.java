package j0520;

public class Fourth {

	//for문을 이용하여 콘솔창에 입력한 숫자만큼 "오늘은 월요일" 출력
	
	int day;  //변수 선언 
	
	public void today() //메소드 
	{	
		for(int i=1; i<=day; i++) {
			 System.out.println("오늘은 월요일 "+i);
		}
	
	}
		
	

}
