package j0520;

public class FirstMain {

	public static void main(String[] args) {
	
		//First클래스를 first객체로 생성 클래스내의 속성,메소드를 호출할 때 객체이름사용 
		First first=new First();
		
		//메소드 실행 전 필요한 값을 할당
		first.num1=10;  //First Class에는 int num1,num2;로 선언만 되어있음.
		first.num2=20;
		
		
		first.add();
		first.sub();
		first.mul();
		first.div();
		
		
	}

}
