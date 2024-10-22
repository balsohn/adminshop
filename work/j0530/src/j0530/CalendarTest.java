package j0530;

import java.time.LocalDate;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {

		//사용자가 년 월을 입력하면 디폴트로 달력은 1일부터 설정 
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 년도 입력: ");
		int year=sc.nextInt();
		System.out.print("원하는 월 입력: ");
		int month=sc.nextInt();
		LocalDate xday=LocalDate.of(year, month, 1);
		
		System.out.println(" ");
		int totald=xday.lengthOfMonth(); //총 일수 
		
		int year2=xday.getYear();		//해당 년도
		int month2=xday.getMonthValue(); 	//해달 월 
		int days=xday.getDayOfWeek().getValue(); //요일 넘버 구하기 
		
		
		if(days==7) //일요일 0으로 만들기. 달력 앞쪽 빈칸 생성 
		{
			days=0;
		}
		int week=(int)Math.ceil((totald+days)/7.0); //정수형 변환 7일만큼 나눴을 때 몇 행인지.
		
		int day=1;				 //행은 1~5행까지 
		for (int i=1; i<=5; i++)  //5는 1주일을 기준으로 전체 일수를 나눈 행의 갯수 
			for (int j=0;j<7;j++)	//일요일 0. 0~6까지 
			{
				if((i==1 && j<days) || (totald < day) ) 		
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

