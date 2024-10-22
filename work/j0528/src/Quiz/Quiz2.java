package Quiz;

import java.util.Scanner;

public class Quiz2 {

	class NameHandler {
		//콘솔창으로 5명의 이름을 입력받아서 구분자 "-"를 이용하여
		//하나의 문자열로 만들어 names에 저장한다.
	String[] name=new String[5];

	public void input ()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("5명의 이름을 입력하세요: ");
		for (int i=0; i<5; i++)
		{
			System.out.println((i+1)+"번째 이름: ");
			name[i] = sc.nextLine();
		}
		
	}
	public void output() {
		System.out.println("입력된 이름 문자열:");
		for (int i=0; i<name.length; i++) {
			if(i > 0) {
				System.out.print("-");
			}
			System.out.println(name[i]);
		}
		
		System.out.println("분리된 이름:");
		for (String name1 : name) {
			System.out.println(name1);
		}
		
	}
	}	
	}	
		/*
		//names문자열에 있는 이름을 분리하여 출력한다.
		public String split()
		{
		String[] names=name.split("-");
		}

		
		*/


