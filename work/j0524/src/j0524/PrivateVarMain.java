package j0524;

public class PrivateVarMain {

	public static void main(String[] args) {
		
		PrivateVar pv=new PrivateVar();
		
		//private 속성은 외부클래스에 값을 주지 못한다.
		//pv.age=11;
		//pv.name="홍길동";
		//pv.juso="고양시";
		
		
		//[1]public 메소드를 활용하여 값을 호출하기	
		//pv.init();   //전역변수는 private, init 메소드는public 
		//pv.print();	 //전역변수는 private, print메소드는public 
		
		
		pv.init(23, "배트맨", "파주시"); //매개변수 할당 메소드 
		pv.print();					  //출력 명령 메소드 
		
		System.out.println();
		
		pv.init(66, "뽀로로", "울릉도");
		pv.print();
		
	}

}
