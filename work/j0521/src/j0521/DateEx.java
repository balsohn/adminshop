package j0521;

import java.util.Date;

//모든 자바에서 제공되는 클래스(라이브러리)를 사용하려면
//무조건 import를 하여야 한다. 
//import 패키지명.클래스명;
//단, 자바는 java.lang패키지내에 있는 클래스는 import생략 가능. 자주 쓰는 것들은 lang에 있다.

public class DateEx {

	 public static void main(String[] args) {
		//날짜 클래스
		 //Date, Calendar, time패키지
		 
		 Date today=new Date();
		 int year=today.getYear()+1900; //1900년을 기준
		 int month=today.getMonth()+1;	//0~11의 값을 가져온다. 0이 1월. 자바스크립트도 동일.  
		 int date=today.getDate();
		 
		 int hours=today.getHours();
		 int minutes=today.getMinutes();
		 int seconds=today.getSeconds();
		 
		 System.out.println(year+ "년 "+month+ "월 "+date+"일");
		 System.out.println(hours + "시 "+minutes+ "분 "+seconds+"초");
		 
	}
}
