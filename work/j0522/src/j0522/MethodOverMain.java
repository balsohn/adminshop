package j0522;

public class MethodOverMain {

	public static void main(String[] args) {
	
		MethodOver mo=new MethodOver();
		
		mo.print();  			//매개변수 없음
		mo.print(100);			//매개변수 1개
		mo.print(10, 100);		//매개변수 동일한 자료형,갯수 2개 
		mo.print(88, "홍길동");	//매개변수 동일한 자료형,갯수 2개 다른 위치 
		mo.print("배트맨", 77);	//매개변수 동일한 자료형,갯수 2개 다른 위치 
		
		
		
		
	}

}
