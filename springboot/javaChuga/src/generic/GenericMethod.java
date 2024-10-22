package generic;

public class GenericMethod {
	public void print() {
		System.out.println("출력합니다");
		
	}
	
	public void cal(int a,int b) {
		System.out.println(a+b);
	}
	
	public <T> void output(T t) {
		System.out.println(t);
	}
}
