package j0527;

public class Son5Main {

	public static void main(String[] args) {
		
		
		Son5 s5=new Son5();
		
		s5.kor=99;
		s5.eng=88;
		s5.mat=77;
		
		s5.calc(); //Son5의 오버라이드 메소드
		s5.output(); //부모클래스 속성에 속성 추가  
		
		s5.oldcalc(); // 새로운 문법 super를 통해  
		s5.output();  //Son5에 부모메소드 calc메소드를 실행.

	}

}
