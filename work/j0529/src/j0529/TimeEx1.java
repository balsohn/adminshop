package j0529;

import java.time.LocalDateTime;

public class TimeEx1 {
	
	//Date 일0 ~6
	//Calendar 일1 ~ 토7 
	//Local 일7 월1~토6
	
	public static void main(String[] args) {
	LocalDateTime today=LocalDateTime.now();
	
	//LocalDate, LocalTime도 있다
	
	int year=today.getYear();
	int month=today.getMonthValue();
	int date=today.getDayOfMonth();
	
	System.out.println(year+"년 "+month+"월 "+date+"일 ");
	
	int hour=today.getHour();
	int min=today.getMinute();
	int sec=today.getSecond();
	System.out.println(hour+"시 "+min+"분 "+sec+"초");
	
	//System.out.println(today.getDayOfWeek());영문 요일 표기
	
	int day=today.getDayOfWeek().getValue();
	System.out.println(day); //요일의 숫자가 표기 수요일=3

}
}