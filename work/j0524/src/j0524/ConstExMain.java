package j0524;

public class ConstExMain {

	public static void main(String[] args) {
		
		//new ConstEx(); //객체 생성 완. 사용가능 
		
		//ConstEx ce= new ConstEx();
		//ce객체명으로 사용하겠다. 
		
		
		//3.final변수에 값이 없을 경우와 있을 경우 
		final int eng;
		
		final int kor=99;
		//kor=88; final변수는 값을 변경하지 못한다. 
		
		//ConstEx(int b)에 매개변수값 직접 할당
		//클래스 속성 final int b;에 값 저장 
		ConstEx ce= new ConstEx(50);
		
		
	}

}
