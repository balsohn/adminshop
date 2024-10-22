package lamda;

public class TestInter2Main {
	public static void main(String[] args) {
		TestInter2 ti=new TestInter2() {
			public void output(String str) {
				System.out.println(str);
			}
		};
		
		ti.output("하이");
		
		TestInter2 ti2=(str) -> {
			System.out.println(str);
		};
		ti2.output("안녕");
		
		TestInter2 ti3=(str)-> System.out.println(str);
		ti3.output("ㅎㅎ");
		
	}
}
