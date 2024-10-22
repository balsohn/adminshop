package j0529;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class TimeEx2 {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		int year=today.getYear();
		int month=today.getMonthValue();
		int date=today.getDayOfMonth();
		System.out.println(year+"년 "+month+"월 "+date+"일 ");
	
		LocalTime today2=LocalTime.now();
		int hour=today2.getHour();
		int min=today2.getMinute();
		int sec=today2.getSecond();
		System.out.println(hour+"시 "+min+"분 "+sec+"초");
		
	}

}
