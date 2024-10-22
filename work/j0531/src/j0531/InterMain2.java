package j0531;

public class InterMain2 {

	public static void main(String[] args) {
		//인터페이스 구현을 하는 또 다른 방법 => 임의 구현방식
		
		//InterEx3 inter3=new InterEx3(); 객체생성 오류
		//InterEx3 inter3=new InterEx3(){}; 
		//생성자 뒤에 {}를 추가하고 안에 임시구현으로 Override 
		
		InterEx3 inter3=new InterEx3() 
		{
			int kor=99;
			
			public void test()
			{
				System.out.println("구현클래스의 추가메소드"+ kor);
			}
			
			//임의 구현 방식은 추가된 속성, 메소드는 
			//내부에서만 사용가능 
			@Override
			public void print() {
				System.out.println("print");
				test();			//test() 활용 예시 
			}

			@Override
			public void input() {
				System.out.println("input");
			}

			@Override
			public void output() {
				System.out.println("output");
			}
		};
		
		inter3.print();
		inter3.input();
		inter3.output();
		//inter3.test();
		
		
		
	}

}
