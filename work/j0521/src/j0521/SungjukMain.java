package j0521;

public class SungjukMain {

	public static void main(String[] args) {
		//3명의 국어점수를 입력받아서 수,우,미,양,가를 출력하는 메소드 
		
		Sungjuk sj=new Sungjuk();
		
		sj.jumsu1();
		
		sj.jumsu2(90,88,78);
		
		String aa=sj.jumsu3();
		System.out.println(aa);
		
		String bb=sj.jumsu4(90,88,78);
		System.out.println(bb);
		
	}

}
