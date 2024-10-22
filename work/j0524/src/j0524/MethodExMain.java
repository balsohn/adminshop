package j0524;

public class MethodExMain {

	public static void main(String[] args) {
		
		
		MethodEx me=new MethodEx();
		
		//1.매개변수 호출 할당 
		me.hap(10, 100);
		//할당한 값은 클래스 메소드로 보내고 출력한다. 
		
		
		//2. 리턴 호출 값 전달받기 
		int hap=me.hap2(1, 20);
		System.out.println("리턴 합은 :" + hap);
		//메인의 hap과 클래스의 hap은 다른 변수 
		
	}

}
