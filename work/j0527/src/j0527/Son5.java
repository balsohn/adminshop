package j0527;

public class Son5 extends Parent{
	
	//부모클래스의 메소드를 그대로 사용할 수 없을때
	//메소드명을 변경하지 않고 수정할 수 있는 기능을 제공 
	//Overriding 
	
	int mat;
	
	@Override //어노테이션(annotation) 
	public void calc()
	{
		hap=kor+eng+mat;
	}
	
	//나는 Parent의 calc메소드를 사용하고 싶다
	//java에서는 부모클래스의 속성, 메소드를 접근하는 키워드를 제공 
	//super => 부모클래스를 가리킨다 
	
	public void oldcalc() {
		super.calc(); //부모메소드의 calc메소드를 실행하라 
	}
	
	
}
