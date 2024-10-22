package test;

public class Son4Main {

	public static void main(String[] args) {
		//protected는 상속을 받은 클래스에서 사용가능 => Son4 
		//패키지가 다를 경우 
		//Son3와 Son4의 경우 차이점은 상속하는 부모패키지의 위치 
		
		Son4 s4=new Son4();
		
		 //private  s4.num1=88; 
		 //default  s4.num2=77;	
		//protected s4.num3=66;  
		s4.num4=55;
		
	
	}
		

}
