package j0522;

public class ConstEx2Main {

	public static void main(String[] args) {
		
		//생성자를 실행시킬때 배열의 크기를 매개변수로 바로 설정  
		ConstEx2 ce2=new ConstEx2(5);
		
		//ce2.init(5); 원래는 설계에서 메소드를 생성한 뒤 메인에서 호출한 뒤 값 설정 
		//ConstEx2 ce2=new ConstEx2(); 이 두 방법은 사용자가 값을 할당하지 않으면 오류가 남. 
		
		
		

	}

}
