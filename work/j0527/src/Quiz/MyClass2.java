package Quiz;

public class MyClass2 extends TotalHap{
	//1~n까지의 합을 구하는 메소드를 override하시오 
	
	@Override
	public void calc() {
		int n=(int)(Math.random()*100000)+1;
	
		for (int i=1; i<=n; i++) {
			hap=hap+i;
		}
		System.out.println(hap);
	}
}