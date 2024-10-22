package object;

import java.util.Date;

public class ObjectMain {
	public static void main(String[] args) {
		// Object : 모든 클래스의 상위 클래스
		// 다형성의 원칙 : Object 클래스는 모든 클래스를 담을수 있다.
		
		Object obj=new MyTest();
		Object obj2=new Date();
		
		// obj2는 Date객체를 담고 있다.
		Date today=(Date) obj2;
		System.out.println(today.getDate());
		
		Object str1=new String("하하하");
		Object str2="하하하";
		Object str3="호호호";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(obj2.toString());
		System.out.println(obj);
		
		if(str1==str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(str1.equals(str2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
