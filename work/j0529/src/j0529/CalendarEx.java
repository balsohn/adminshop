package j0529;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		//날짜관련 클래스: Date, Calendar, time패키지
		
		Calendar today=Calendar.getInstance(); //new가 생략됐지만 작동하고 있다.
		
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH); //0~11
		int date=today.get(Calendar.DATE);
		
		System.out.println(year+"년 "+month+"월 "+date+"일 ");
		
		int hour=today.get(Calendar.HOUR);
		int min=today.get(Calendar.MINUTE);
		int sec=today.get(Calendar.SECOND);
		
		System.out.println(hour+"시 "+min+"분 "+sec+"초");
		
		int day=today.get(Calendar.DAY_OF_WEEK); //1~7까지의 값 
		System.out.println(day);

	}

}
