package mymy;

import mytest.MyClass;

public class TestMain {
	public static void main(String[] args) {
		MyClass mc=new MyClass();
		
		mc.input(80, 90, 70);
		
		System.out.println("평균 : "+mc.avg());
		System.out.println("총점 : "+mc.tot());
		
	}
}
