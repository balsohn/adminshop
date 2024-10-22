package j0524;

public class PrivateVar2Main {

	public static void main(String[] args) {
	
		PrivateVar2 pv2=new PrivateVar2();
		
		pv2.method1("hong");
		pv2.method2("홍길동");
		pv2.method3(99);
		pv2.method4("010-1234-5678");
		
		//출력
		pv2.print();
		
		//private변수의 값을 호출한 곳에서 사용할 수 있다.
		pv2.method1("ABC");
		pv2.method2("가나다");
		pv2.method3(88);
		pv2.method4("010-987-6543");
		
		String userid=pv2.method5();
		String name=pv2.method6();
		int level=pv2.method7();
		String phone=pv2.method8();
		
		System.out.println(" ");
		System.out.println("아이디: "+userid);
		System.out.println("이 름: "+name);
		System.out.println("레 벨: "+level);
		System.out.println("번 호: "+phone);
		
		
		
		
	}

}
