package j0516;

import java.util.Scanner;


public class ArrayEx5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// String 배열
		String[] names=new String[6];
		
	
		for(int i=0;i<names.length;i++)
		{
			names[i]=sc.next();
		}

		
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}

		//6명의 이름을 입력하고 그 중에 한명을 임의로 선택 출력 
		
		int n=(int)(Math.random()*6);
		
		System.out.println(names[n]);
		
	}

}
