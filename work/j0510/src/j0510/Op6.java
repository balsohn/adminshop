package j0510;

public class Op6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산자가 변수의 앞과 뒤에 있을경우
		
		int a=100;
		int b=100;
		
		a++;
		++b;
		
		System.out.println(a);
		System.out.println(b);
		// a=101, b=101 
		
		System.out.println("----------");
		
		int c=a++; // 대입을 할 경우 변수의 뒤에 있는 증감연산자는 대입후에 실행된다. 
		// a++;
		//int c=a;
		
		int d=++b; // 대입을 할 경우 변수의 앞에 있는 증감연산자는 실행후에 대입된다. 
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
	
	}

}
