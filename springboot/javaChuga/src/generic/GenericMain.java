package generic;

import java.util.Date;
import java.util.HashMap;

public class GenericMain {

	public static void main(String[] args) {
		/*
		Generic gen=new Generic();
		gen.output("안녕하세요");
		gen.output(1234);
		gen.output(33.123);
		gen.output('a');
		gen.output(true);
		gen.output(new Date());
		int[] kors=new int[3];
		gen.output(kors);
		*/
		
	/*	Generic2 genTwo=new Generic2();
		genTwo.output("안녕하세요", 1234);
		genTwo.output(true, new Date().toGMTString());
		
		Generic2<String,Double> genTwo2=new Generic2<String,Double>();
		genTwo2.output("하하하", 12.34);
	*/
		
		GenericMethod gm=new GenericMethod();
		gm.print();
		gm.cal(100, 44);
		
		gm.output("하하하");
		gm.output(2333);
		gm.output(new Date().toGMTString());
	}
}
