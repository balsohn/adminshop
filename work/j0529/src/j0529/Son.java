package j0529;

//추상클래스를 사용하는 방법은 상속을 통해서만 가능하다.
//상속받는 클래스는 부모클래스의 메소드를 재정의(override)가 가능 

public class Son extends AbstractEx{

	@Override
	public void calc() {
		//국어,영어의 합을 구하는 메소드 
		System.out.println(kor+eng);
	}
	

	
	

}
