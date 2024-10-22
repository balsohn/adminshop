package j0528;

import java.util.Scanner;

public class TeacherQ2 {
	
	String names=""; //null 값이 없다는것을 제거 
	
	public void input()
	{
		Scanner sc=new Scanner (System.in);
		names=sc.next();
		/*
		for(int i=1; i<=5; i++)
		{
			String name=sc.next();
			names=names+name+"-";
		}
	*/
	}
	
	public void output()
	{
		String[] imsi=names.split("-");
		
		for(int i=0; i<imsi.length; i++)
		{
			System.out.println(imsi[i]);
		}
	}

}
