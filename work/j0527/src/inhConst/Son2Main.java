package inhConst;

public class Son2Main {

	public static void main(String[] args) {
		
		/*[1]상속없이 생성자 생성 후 직접 값 할당하기 
		Parent2 p2=new Parent2(60); //합격의 기준점수 
		p2.isPass(99);			   //생성자에 직접 값 할당 
		
		Parent2 p22=new Parent2(90);
		p22.isPass(89);
		*/
		
		
		/*//상속받은 클래스 
		Son2 s2=new Son2(70); //기준 
		s2.isPass(60);
		
		Son2 s3=new Son2(60); //기준 
		s3.isPass(60);
		*/
		
		Son2 s33=new Son2(60,"홍길동");
		s33.isPass(80);
		s33.output();
		
		//[1]자식클래스 객체생성시 부모클래스 생성자 실행후 자식 클래스 생성자 실행 
		//[2]부모클래스의 생성자에 매개변수가 있으면 자식생성자에 super()통해 전달 
	}
	

}
