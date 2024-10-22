package j0531;

public class Test {

	public static void main(String[] args) {
		/*
		String name="홍길동";
		String str="아빠";
		
		String aaa="학교종이 땡땡땡 어서 모이자 "+name+"이 "+str+"를 기다리신다";
		System.out.println(aaa);
		*/
		
		String name="홍길동";
		int age=22;
		String hakbun="20241234";
		int height=180;
		String email="abcd@naver.com";
		
		String sql="insert into member(name,age,hakbun,height,email)";
		sql=sql+" values('"+name+"',"+age+",'"+hakbun+"',"+height+",'"+email+"')";
		
		System.out.println(sql);
	}

}
