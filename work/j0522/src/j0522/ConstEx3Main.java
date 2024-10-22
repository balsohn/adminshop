package j0522;

public class ConstEx3Main {

	public static void main(String[] args) {
		
		/*
		int num2;는 final이 아니라서 값을 변경해도 출력이 된다. 
		ConstEx3 ce3= new ConstEx3();
		int ce33=ce3.num2=100; 
		System.out.println(ce33);
		*/
	
		//ce3.kors=new int[5]; <final은 초기값있어야 함 
		//ce3.num=44; <final은 초기값있어야 함
		
		//ConstEx3 ce1= new ConstEx3(); 
		//클래스에 생성자의 값이 설정되지 않으면 실행 가능하지만
		//만약 매개변수를 설정한 생성자가 있다면 해당 생성자의 형식을 따라야 실행 가능.
		
		//ConstEx3를 사용하는 사람들마다 값이 틀릴경우
		//클래스에 생성자를 통해서 값을 전달해야 한다(2번)
		
		//a가 작업시 배열의 크기는 5, num=44;
		ConstEx3 ce3=new ConstEx3(5,44);
	
		//b가 작업시 배열의 크기는 10, num=100;
		ConstEx3 ce33=new ConstEx3(10,100);
		
		//c가 작업시 배열의 크기는 100, num=9999;
		ConstEx3 ce333=new ConstEx3(100,9999);
		

	}

}
