package j0516;

import java.util.Scanner;

public class Munje1 {

	public static void main(String[] args) {
		//태어난해로부터 19년이 지나면 성인으로 인정한다..
		
		//콘솔창으로 태어난 해를 입력하면 
		Scanner sc=new Scanner(System.in);
		
		int currentYear=2024;
		
		//생년월일 입력 창. 입력받을 변수 선언  
		System.out.print("태어난 해를 입력하세요 : ");
		int birthYear=sc.nextInt();
		
	    int age= currentYear-birthYear;
	    
		
		//19세 이상이면 
	    if (age>=19) 
	    {
	    	System.out.println("어서 오세요.");	
	    }
	    
	
		//19세 미만이라면 나이로부터 성인이 되는 해까지 날짜 만큼 ?에 출력. 
	    else 
		{
			int yearsleft = 19-age;
			System.out.println(yearsleft + "후에 오세요.");
		}

	
	}
}
