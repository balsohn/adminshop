package j0520; //현재 파일(클래스)의 위치. 폴더(디렉토리)

//class: 컴퓨터에게 명령을 시키는 명령서 => 자주쓰는 명령서를 저장하여 재 사용하기 위한것(라이브러리)	 (레시피)
//	   : 속성(변수variable,필드)+기능(메소드method/함수function) 	(재료와 방법) 
//			멤버변수/멤버필드  		멤버메소드 
public class ClassEx {


	    //1.산술연산. 2.if-else, 3.switch, 4.for, 5.for을 이용한 3개 메소드(공통된 변수설정)
	
	
		// 확장자 .java(src)가 컴파일되서 .class 객체로 변환 (bin 폴더/binary code)
		
		//속성을 선언하는 방법  => 접근제어자 옵션 자료형 속성명; 
		//접근제어자 : public(아무나 사용하시오.변수를 선언한 패키지 내 다른 클래스 포함 다른 패키지/클래스에도 접근.오픈범위는 설정가능)
		//		    protected,	default(선언한 패키지 내 다른 클래스까지만 접근 가능. 다른 패키지는 불가)
		//			(protected는 상속이면 다른 패키지도 가능)
		//			private(현재 속성을 선언한 패키지 내 클래스에서만 접근 가능)
		
		
		//속성(변수) //파랑 전역변수 연보라{}지역변수 
		public int kor;  //접근제어자public 자료형int 속성명kor  
		protected int eng;
		int mat; //생략한 것이 default 
		private int sci; //다른 클래스에서 참조불가 
		//정수형 자료형은 객체 생성시 0으로 초기화 
		
		
		
		//메소드를 선언하는 방법 => 접근제어자 옵션(생략 가능) void(자료형) 메소드명(매개변수) {명령들의 집합}
		public void print() // public(접근제어자) void(자료형) print(매개변수)
		{
			int temp;//지역변수 : 변수가 선언된 {}내에서만 사용 가능 
			//실행할 동작을 기술. 명령들의 집합 
			System.out.println("print메소드");
		}
		
		public void output()
		{
			System.out.println("국어 :"+kor); //kor에 기초값이 없으면 0으로 출력됨 
		}
		
		

}
