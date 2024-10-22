package j0520;

import java.util.Scanner;

public class FifthMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Fifth fifth=new Fifth();
		
		fifth.cal1();
		
		//fifth.n=50;
		System.out.print("n값을 입력하세요 : ");
		fifth.n=sc.nextInt();
		fifth.cal2();
		
		//fifth.a=1;
		//fifth.b=10;
		System.out.print("a값을 입력하세요 : ");
		fifth.a=sc.nextInt();
		System.out.print("b값을 입력하세요 : ");
		fifth.b=sc.nextInt();
		fifth.cal3();
	
	}

}
