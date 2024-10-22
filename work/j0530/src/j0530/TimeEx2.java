package j0530;

import java.time.LocalDate;

public class TimeEx2 {

	public static void main(String[] args) {
		//time패키지는 다양한 메소드를 제공
		//특정일을 기준으로 몇년전후, 몇달전후, 몇일전후 (윤년)
		
		LocalDate today=LocalDate.now();//현재 날짜(now)
		//특정일자 LocalDate.of()
		/*
		LocalDate Birth=LocalDate.of(1989, 2, 8);
		System.out.println(Birth);
		 */
		
		int year=today.getYear();
		int month=today.getMonthValue();
		int date=today.getDayOfMonth();
		System.out.println(year+"년 "+month+"월 "+date+"일 ");
		
		//plusYears(), minusYears() : plusMonths(), minusMonths():plusDays(),minusDays()
		//(기준인)날짜객체. ~ 
		
		LocalDate xday=today.plusDays(1000);
		year=xday.getYear();
		month=xday.getMonthValue();
		date=xday.getDayOfMonth();
		System.out.println(year+"년 "+month+"월 "+date+"일 ");
		
		LocalDate yday=today.minusDays(1000);
		year=yday.getYear();
		month=yday.getMonthValue();
		date=yday.getDayOfMonth();
		System.out.println(year+"년 "+month+"월 "+date+"일 ");
		
		/*년도	plusYears(), minusYears() 
		LocalDate xy=today.plusYears(50);
		year=xy.getYear();
		month=xy.getMonthValue();
		date=xy.getDayOfMonth();
		System.out.println(year+"년 "+month+"월 "+date+"일 ");
		
		
		LocalDate yy=today.minusYears(50);
		year=yy.getYear();
		month=yy.getMonthValue();
		date=yy.getDayOfMonth();
		System.out.println(year+"년 "+month+"월 "+date+"일 ");
		*/
	
		
		

	}

}
