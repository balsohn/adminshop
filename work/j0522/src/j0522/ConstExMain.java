package j0522;

public class ConstExMain {

	public static void main(String[] args) {
		
		ConstEx ce=new ConstEx();
		//생성자는 객체 생성시에 실행 
		
		
		//ce.메소드명();  일반메소드는 객체 생성후 ce. 호출에 의해서 실행 
	
		ce.print();
		//메인 메소드에 따로 ce.Const() 호출하지 않아도 
		//new ConstEx(); 생성시 자동 실행됨
	
		//new Scanner(System.in);
	}

}
