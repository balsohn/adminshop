package nested;

public class Method_Inner {
	private String name;
	public void output() {
		System.out.println("하하하");
		
	}
	
	public void inClass() {
		class Test {
			int kor=99;
			
			public void print() {
				System.out.println("국어 : "+kor);
			}
		}
		
		Test t=new Test();
		t.print();
	}
}
