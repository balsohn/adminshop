package j0521;

public class SungjukMain2 {

	public static void main(String[] args) {
		Sungjuk2 sj=new Sungjuk2();
		
		sj.jumsu1();
		 System.out.println("=============");
		 
		sj.jumsu2(90,88,78);
		 System.out.println("=============");
		 
		String aa=sj.jumsu3();
		System.out.println(aa);
		 System.out.println("=============");
		 
		String bb=sj.jumsu4(90,88,78);
		System.out.println(bb);

	}

}
