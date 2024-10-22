package j0529;

public class Son3Main {

	public static void main(String[] args) {
		
		Son3 s3=new Son3();
		//객체생성시 pass값은 무조건 60
		s3.output();
		Son3 s33=new Son3(70);
		//객체생성시 마다 pass값을 바꿀 수 있다 
		s33.output();
	}

}
