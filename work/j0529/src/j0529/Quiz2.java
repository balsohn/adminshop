package j0529;

import java.time.LocalDate;

public class Quiz2 {
     public static void main(String[] args) {
		
    	 // 날짜 클래스를 이용하여 "2024년 5월 29일 수요일입니다" 출력하기 
     	 
    	  	LocalDate today=LocalDate.now();
    	  	
    	  	int year=today.getYear();
    	  	int month=today.getMonthValue();
    	  	int date=today.getDayOfMonth();
    	  	int day=today.getDayOfWeek().getValue();
     
    	  	/*
    	  	if (day==4)
    			{
    			System.out.println("목요일");
    			}
    		*/
    
    	 //switch문을 이용해서 월1부터 값에 따라 요일을 출력하기 
    	  	String days="";
    	  	switch(day) 
    	  	{
    	  	case 1 : days="월요일"; break;
    	  	case 2 : days="화요일"; break;
    	  	case 3 : days="수요일"; break;
    	  	case 4 : days="목요일"; break;
    	  	case 5 : days="금요일"; break;
    	  	case 6 : days="토요일"; break;
    	  	case 7 : days="일요일"; break;
    	  	default: days="오류";
    	  	}
    	  	System.out.print(year+"년 "+month+"월 "+date+"일 "+days);
	}
}
