package lamda;

public class TestInter3Main {

	public static void main(String[] args) {
		
		TestInter3 ti=new TestInter3() {
			
			@Override
			public String output() {
				return "안녕하세요";
			}
		};
		System.out.println(ti.output());
		
		TestInter3 ti2=() -> {
			return "반갑습니다";
		};
		System.out.println(ti2.output());
		
		TestInter3 ti3=() -> "안녕히 가세요";
		System.out.println(ti3.output());
	}
}
