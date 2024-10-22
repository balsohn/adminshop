package j0520;

public class MainEx {

	public static void main(String[] args) {
	
		//main 메소드는 클래스를 시작하는 메소드. 
		//명령서로 되어있는 클래스를 동작시킨다. 
		
		//ClassEx 클래스를 사용해보기 
		//클래스명 객체변수명=new 클래스명();
		//new를 통해 객체를 만들면 다른 클래스에 있는 객체를 사용할 수 있다.
		
		ClassEx ce=new ClassEx(); 
		
		//instance:= new.ClassEx(); 클래스를 new연산자를 통해 객체를 생성하는 과정 
		//instance variable: =ce(=객체변수명/클래스변수), 인스턴스 변수는 클래스를 인스턴스화 시켜서 만든 변수.
		
		//객체 생성후에는 객체변수이름으로 클래스의 속성, 메소드에 접근
		//속성: 값을 준다
	
		
		
		//원래 클래스ClassEx에는 kor; 초기값이 설정되어 있지 않지만 
		ce.kor=111;  //속성은 값을 준다. 이곳에 값을 설정하면 콘솔에 입력값이 나온다. 
		ce.eng=222;
		
		//ce.print(); // 메소드는 명령을 실행한다. ClassEx에 설정한 값이 출력됨 
		//ce.output(); //	//메소드 : 메소드의 {}의 내용을 실행한다 
	
		System.out.println(ce.kor+" "+ce.eng);
		
		
	}

}
