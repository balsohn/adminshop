package pkc;

import j0524.A;

public class My extends A { 
	//다른 접근제한자에 다른 패키지에 있는 속성을 사용하려고 할때 
	//다른 패키지에 있는 My클래스는 다른 패키지에 있는 A를 상속한다
	//public, protected는 사용 가능 
	
	public void test()
	{	
	A a=new A();
	
	kor=77; //public 가능 
	eng=88; //protected 가능 
	//mat=77;  //default 불가능 
	//sci=77; //private 불가능 

	a.kor=100; //public 가능 
	//a.eng=99; //protected 불가능 
	//a.mat=88; //default 불가능 
	//a.sci=77; //private 불가능 
	}
}
