package nested;

public class Instance_Inner {
	
	private int kor;
	public void output() {
		System.out.println("출력");
	}
	
	public static void test1() {
		System.out.println("Instance_Inner의 static 메소드");
	}
	
	class Sungjuk {
		int kor,eng,mat;
		public void input(int kor,int eng, int mat) {
			this.kor=kor;
			this.eng=eng;
			this.mat=mat;
			
		}
		
		public void hap() {
			int hap=kor+eng+mat;
			System.out.println("합: :"+hap);
		}
		
		public static void test2() {
			System.out.println("Sungjuk의 static 메소드");
		}
	}
}
