package j0530;

import java.time.LocalDate;

public class TimeEx3 {

	public static void main(String[] args) {
		
		//특정일의 날짜객체 만들기
		LocalDate xday=LocalDate.of(2002, 8, 8);
		
		//특정일 + 특정일 추가 
		LocalDate pday= xday.plusDays(1000);
		int year=pday.getYear();
		int month=pday.getMonthValue();
		int date=pday.getDayOfMonth();
		System.out.println(year+"년 "+month+"월 "+date+"일 ");
		
		LocalDate mday=xday.minusDays(888);
		year=mday.getYear();
		month=mday.getMonthValue();
		date=mday.getDayOfMonth();
		System.out.println(year+"년 "+month+"월 "+date+"일 ");

	}

}
