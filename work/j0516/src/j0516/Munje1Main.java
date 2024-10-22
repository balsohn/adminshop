package j0516;

import java.util.Scanner;


public class Munje1Main {
	
	int currentYear;
	int birthYear;
	int age=(currentYear-birthYear);

	
	public void cal() {
		
    if (age>=19) 
   
    {
    	System.out.println("어서 오세요.");	
    }
    
    else 
	{
		int yearsleft = 19-age;
		System.out.println(yearsleft + "후에 오세요.");
	}
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		Munje1Main mun1=new Munje1Main();
		
		mun1.currentYear=2024;
		
		//생년월일 입력 창. 입력받을 변수 선언  
		System.out.print("태어난 해를 입력하세요 : ");
	    mun1.birthYear=sc.nextInt();
	    
	   
	   
	   
	   
	    
	    
	
	
	}

}
