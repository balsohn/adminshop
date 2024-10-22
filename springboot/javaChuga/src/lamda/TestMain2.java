package lamda;

public class TestMain2 {
	public static void main(String[] args) {
		// 구현 클래스를 통해서 추상 메소드를 구현하지 않고 직접 구현하는 방식
		
		TestInter test=new TestInter() {
			// 추삼메소드를 재정의한다.
			@Override
			public void output() {
				System.out.println("출력 성공");
				
			}
		};
		
		test.output();
		
		TestInter test2=()-> {
			System.out.println("또 출력했습니다.");
		};
		
		test2.output();
		
		TestInter test3=() -> System.out.println("출력");
		test3.output();
	}
}
