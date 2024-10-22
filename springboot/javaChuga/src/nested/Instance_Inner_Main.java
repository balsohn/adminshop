package nested;

import nested.Instance_Inner.Sungjuk;

public class Instance_Inner_Main {
	
	public static void main(String[] args) {
		
		Instance_Inner.test1();
		Instance_Inner.Sungjuk.test2();
		
		/*
		Instance_Inner ii=new Instance_Inner();
		ii.output();
		
		// 내부에 있는 클래스를 사용하기
		Sungjuk is=ii.new Sungjuk();
		
		is.input(80, 90, 70);
		is.hap();
		
		*/
	}
}
