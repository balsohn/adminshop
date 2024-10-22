package j0530;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimeEx4 {

	public static void main(String[] args) {
		
		//두 날짜객체간의 년,월,일 계산하기
		//특정일1, 특정일2
		LocalDate xday=LocalDate.of(2005, 1, 13);
		LocalDate yday=LocalDate.of(2024, 12, 25);
		
		long year=xday.until(yday,ChronoUnit.YEARS);
		long month=xday.until(yday,ChronoUnit.MONTHS);
		long date=xday.until(yday,ChronoUnit.DAYS);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
		
		//Math.abs 절대값 (음수 출력 안됨)
		year=Math.abs(year);
		month=Math.abs(month);
		date=Math.abs(date);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
		
	}

}
