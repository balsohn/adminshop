package j0529;

public class AbstractMain {

	public static void main(String[] args) {
		
		//추상클래스는 객체생성을 못한다 
		//기능이 없는 추상메소드를 가지고 있으므로 
		//AbstractEx ae=new AbstractEx();
		
		//추상클래스는 어떻게 사용할까?
		//상속받은 클래스를 객체생성하여 사용 
		Son s=new Son();
		s.input(80, 90);
		s.calc();
		
		Son2 s2=new Son2();
		s2.input(60, 70);
		s2.calc();
	
	}
}
