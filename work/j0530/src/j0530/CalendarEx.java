package j0530;

import java.time.LocalDate;
import java.util.Scanner;

public class CalendarEx {
	public static void main(String[] args) {

	//콘솔창에 오늘날짜 기준의 달력을 만들어 봅시다
	LocalDate today=LocalDate.now();
	System.out.println("오늘은 : " + today);
	
	//달력 만들때 필요한 값: 1일의 요일(보통 일요일 먼저), 총 몇주, 총일수 
	//총일수
	int chong=today.lengthOfMonth();
	System.out.println("이번달 총 일수는 : " + chong);
	
	//1일의 요일
	//오늘기준 1일의 요일 날짜객체를 만든다
	int year=today.getYear(); 					//올해 년도  
	int month=today.getMonthValue();			//이번달 
	LocalDate xday=LocalDate.of(year, month, 1); //새로운 요일 설정. xday=1일 
	int yoil=xday.getDayOfWeek().getValue(); //1~7 
	System.out.println("이번달의 1일은 : " +xday);
	System.out.println("이번달의 수요일의 값은: "+yoil);
	//해당 요일의 숫자만큼 빈칸의 수가 생성된다.  수요일3 앞으로 = 빈공간 3칸(1일 기준으로 지난달의 마지막 일수)  

	
	if (yoil==7)
	{
		yoil=0; 	//일요일의 경우 7만큼 빈칸이 생기면 빈공간의 한줄의 행이 생성되기때문에 if문을 사용해서 행을 없애준다. 
	}
	
	//총 몇주 * 월 말 이후의 빈공간(다음달의 시작일)은 소수점으로 환산되서 출력. 1칸 4.8... 
			//int/int => int(소수점은 버린다) => int/double => double 
			//즉 뒤에 남는 공간(다음달의 시작일)을 포함해야하기 때문에 실수형double을 사용해서 포함시킨다.
			// Math.ceil(): 올림, Math.round():반올림, Math.floor():내림
	
		//System.out.println(Math.ceil((chong+yoil)/7.0));  //Math.ceil을 이용해서 올림을한다. 결과값 소수점으로 출력
		int ju=(int)Math.ceil((chong+yoil)/7.0); 			//Math.ceil을 다시 이용해서 ((chong+yoil)/7.0)를 정수형으로 변환 
		//System.out.println(ju);								//정수형으로 출력 
	
		int day=1;
		for (int i=1; i<=5; i++)   //행 
		{
			for (int j=0;j<7;j++)	// 열 yoil=0; 일요일은 0. 0부터 ~6. 
			{
				if((i==1 && j<yoil) || (chong < day) ) 
					//i(행)=1행이면서 요일의 값보다(yoil 수3) j(칸의 순서)가 작을 때 빈칸으로 출력. 
					//OR
					//chong(총 한달의 일수 보다 day++;실행한 결과의 값이 더 클때 빈칸으로 
				{
					System.out.printf("%3s"," ");
				}
				else
				{
					System.out.printf("%3d",day);
					day++;
				}
			
			}
			System.out.println();
		}
		
		
	}

}
