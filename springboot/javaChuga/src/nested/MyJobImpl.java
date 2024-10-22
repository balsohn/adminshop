package nested;

public class MyJobImpl implements Interface_Inner.MyJob {

	@Override
	public void print() {
		System.out.println("구현클래스에서 메소드를 구현");
	}

}
