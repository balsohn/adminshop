package pkc;

import j0524.A;

public class D {
	//다른 접근제한자에 다른 패키지에 있는 속성을 사용하려고 할때 
	
	public void test()
	{
	A a=new A();
	a.kor=100; //public 가능 
	//a.eng=99; //protected 불가능 
	//a.mat=88; //default 불가능 
	//a.sci=77; //private 불가능 
	}
}
