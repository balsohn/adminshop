package j0527;

public class Son2 extends Parent {
	//국,영,수 세과목의 합계를 만드는 프로그램
	//Parent클래스에 3개의 속성, 하나의 메소드를 그대로 사용할 수 있다
	//Son2클래스에 사용을 위해 상속을 한다. 

	int mat;
	
	public void calc2()
	{
		hap=kor+eng+mat;
	}
}
