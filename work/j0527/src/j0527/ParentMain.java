package j0527;

public class ParentMain {

	public static void main(String[] args) {
		
		//Parent 클래스의 속성, 메소드를 사용하고자 할때 
	
		Parent p=new Parent();
		
		p.kor=100;
		p.eng=99;
		
		p.calc();
		p.output();
		
		//Parent 클래스의 상속받는 클래스로서 작업도 가능하다 
		Son s=new Son();
		
		s.kor=88;
		s.eng=77;
		
		s.calc();
		s.output();
		
	

	}

}
