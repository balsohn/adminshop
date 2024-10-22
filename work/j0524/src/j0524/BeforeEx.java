package j0524;

public class BeforeEx {
	
		//-----------------객체지향언어: OOP(Object Oriented Programming)--------------------//
		//컴퓨터에게 작업할 명령을 속성과 메소드로서 정의한다.  
			
		//[1]클래스=속성+메소드
		//클래스 : 프로그램 명령서(요리 레시피/ 설계도) = 속성(클래스변수,변수,필드,멤버변수,멤버필드) + 메소드(기능, 함수)
		
		//속성선언: 접근제한자 옵션 자료형 변수명; => public 
		//		 -접근제한자:public, protected, default(생략 가능), private(해당 클래스만 접근가능)
		// 		 -옵션    : final, static, 
		//		 -자료형	 : 저장될 자료 => int, double, char, boolean, String, 클래스명(Ex. Date)
		//		 -변수명   : 저장되는 공간의 이름 (첫자는 소문자, 첫자에 숫자X, 스페이스문자X,예약어X, 특수문자 $ _)
		
		//메소드선언: 접근제한자 옵션 리턴자료형 메소드명(매개변수)
		//			{			
		//			실행될 내용
		//			}
		//		  -리턴자료형: 리턴 X => void, 리턴 O => 리턴되는 값의 자료형 
	
	
	
		//현재 작성 중인 클래스 public class BeforeEx { 사이에 속성과 메소드를 선언할 수 있다. 이하 참고} 
		
		//[2] 속성선언과 메소드선언의 예 
		//1.속성선언의 예 : 
		public int kor;
		public int eng;
		protected int mat;
		int sci;
		
		//2.메소드선언의 예 : 
		public void test1() //리턴X 메소드의 예 
		{
			int imsi; //클래스의 속성이 아니다 <main 클래스에서 사용 불가. 
					  //메소드 안에 존재하는 지역 변수. 
			System.out.println(kor);
	
		}
	
		public int test2() //리턴O 메소드의 예 
		{
	
			return 1; //리턴문장은 마지막에 작성. 프로그램의 실행 후 마지막 문장. 
		}
	
}
