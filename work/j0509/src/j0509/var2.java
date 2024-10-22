package j0509;

public class var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형 자료형은 어떤게 있나? 
		// byte, short, int, long 
		//  1     2     4     8
		
		//선언
		byte num1;
		short num2;
		int num3;
		long num4;
		
		//할당
		num1=127; //oveflow : 용량이 넘칠경우 
		num2=31000;
		num3=1234512345;
		num4=123451234512345L;
		
		//자바에서는 숫자는 무조건 int형으로 인식. 숫자 뒤에 L(long)표시
		
		System.out.println(num3);
		//크기가 작은 변수의 값을 크기가 큰 변수에 저장
		num3=num2;
		System.out.println(num3);
		
		//크기가 큰 변수의 값을 작은 변수에 저장시 오류 
		//num3=num4; overflow때문에 오류발생
		
		//=는 대입연산자 
		// 오른쪽에 있는 값을 왼쪽에 대입한다 
		
	}

}
