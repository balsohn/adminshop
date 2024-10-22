package j0527;

public class Son2Main {

	public static void main(String[] args) {
		
		//Son2에 새로운 속성과 메소드를 추가한 뒤 출력 
		Son2 s2=new Son2();
		s2.kor=99;
		s2.eng=88;
		s2.mat=77;
		
		//Parent의 국+영 메소드  
		s2.calc();
		s2.output();
		//Son2의 국+영+수 메소드 
		s2.calc2();
		s2.output();
		

	}

}
