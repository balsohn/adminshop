package j0513;

public class Test {

	public static void main(String[] args) {
		// 문자열 연결연산자 => + 
		
		System.out.println( 10+10);
		System.out.println(10+"점"); //숫자랑 문자를 붙여서 사용하고 싶을때
		System.out.println("하하하"+"호호호"+"ggg");

		
		int kor=99;
		
		System.out.println("국어점수는 "+kor+"점 입니다");
		
		int eng=88;
		
		// 국어와 영어의 합계점수를 출력할때
		// 동일한 우선순위의 연산자는 앞에서부터 실행
		System.out.println("국어와 영어의 합계 : " +(kor+eng));
				
		String num1="100"; //문자열 "  " 문자로 인식 
		String num2="88";
		
		System.out.println(num1+num2);
		
		int num3=100;   //정수 " " 생략 합산 출력 
		int num4=200;
		
		System.out.println(num3+num4);
		

	}

}
