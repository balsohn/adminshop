package j0530;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimeEx5 {

	public static void main(String[] args) {
		//두 날짜객체간의 년,월,일 계산하기
		//특정일1, 오늘
		
		LocalDate today=LocalDate.now();
		LocalDate xday=LocalDate.of(2024, 10, 22);
	
		long year=today.until(xday,ChronoUnit.YEARS);
		long month=today.until(xday,ChronoUnit.MONTHS);
		long date=today.until(xday,ChronoUnit.DAYS);

		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	
		

	}

}
