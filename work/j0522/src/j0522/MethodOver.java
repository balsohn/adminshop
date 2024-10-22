package j0522;

public class MethodOver {

	//overloading : 동일한 메소드를 추가하는 것 
	//조건 : 매개변수의 갯수및 자료형의 형태가 다를 경우 
	
	
	public void print(int a)
	{
		System.out.println("mo.print(100); :" + a );
	}
	/*//동일한 자료형과 갯수를 가진 매개변수는 이름이 달라고 동일하다고 봐서 오류가 난다. 
	public void print(int kor, int eng)
	{
			System.out.println("네번째");
	}
	*/
	public void print(int a, int b)
	{
		System.out.println("mo.print(10, 100); : "+ a+" "+b);
	}
	public void print()
	{
		System.out.println("mo.print();:"+" ");
	}
	//동일한 자료형과 갯수를 가져도 순서가 다르면 가능하다.
	public void print(int a, String b)
	{
		System.out.println("mo.print(88, \"홍길동\"); :"+a+ "/"+b);
	}
	public void print(String a, int b)
	{
		System.out.println("mo.print(\"배트맨\", 77); :"+a+ "/"+b);
	}

}
