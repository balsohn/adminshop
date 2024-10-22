package j0522;

import java.util.Scanner;

public class Mun4 {
	
	String[] names; 
	
	//[1] names 배열의 매개변수를 이용하여 할당하는 메소드를 만드시오.
	public void init(int n) {
		names=new String[n]; 			
	}
	
	//[2] names의 배열의 크기만큼 Scanner를 이용하여 이름을 입력하는 메소드
	/*
	public void input() { 	
		
		Scanner sc=new Scanner(System.in); 
		
		for(int i=0; i<names.length; i++)  
		{
			names[i]=sc.next();
		}	
	}
	*/
	//[4]배열에 입력된 값을 할당받기
	public void input(String[] inputNames) {
		for (int i=0; i<names.length; i++)
		{
			names[i]=inputNames[i];
		}
	}

	//[3] names의 입력된 사람중에서 1명의 사람을 선택하여 이름을 리턴해주는 메소드
	public String getName() 
	{
		int ck=(int)(Math.random()*names.length); 
		return names[ck];// 
	}
}

