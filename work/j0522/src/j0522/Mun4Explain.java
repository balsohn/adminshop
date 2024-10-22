package j0522;

import java.util.Scanner;

public class Mun4Explain {
		String[] names; //5.값이 정해지지 않은 배열 names배열 선언 
	
		//[1] names 배열의 매개변수를 이용하여 할당하는 메소드를 만드시오.
	public void init(int n) { //6. init 메소드 생성 (그래야 int n값 받을 수 있음)
		
		names=new String[n];//7.콘솔창에 입력된 수만큼의 문자열 배열을 선언 
							//정수배열n의 값을 names배열에 저장
							//Ex) int[5] = kors[5]= names[5]
	}
	
		//[2] names의 배열의 크기만큼 Scanner를 이용하여 이름을 입력하는 메소드
	public void input() 		//8.input 메소드 
	{
		Scanner sc=new Scanner(System.in); //9.스캐너 생성 
		for(int i=0; i<names.length; i++) //10.names배열길이 만큼 
		{
			names[i]=sc.next(); //11.이름을 입력하겠다
		}	
	}

		//[3] names의 입력된 사람중에서 1명의 사람을 선택하여 이름을 리턴해주는 메소드
	public String getName() //13.이름 입력 메소드 선언 
	{
		//1명을 정하는 방법은 인덱스 값을 임의로 생성해서 정한다.
		//5명일 경우=> 배열의 크기는 5=> 01234
		//0~n-1까지의 임의의 수를 구하면 된다 
		//Math.random()*배열의 크기 => (int) 0부터 시작이기때문에 1을 더할 필요없다.
		
		int ck=(int)(Math.random()*names.length); //14.names배열 길이 만큼 랜덤숫자 구하기
		return names[ck];//15. names배열에 위에서 구한 랜덤번호 ck를 대입 
	}
	
//------------------------------여기부터 메인-----------------------------//

	public static void main(String[] args) {
	//Scanner를 이용하여 입력할 사람의 인원수를 받으시오
		Mun4 m4=new Mun4(); 
		Scanner sc=new Scanner(System.in);
		//1.배열의 크기가 처음부터 지정되지 않았을 경우 우선 선언만 한다. 
		int[] kors; 
		//2.콘솔창에 배열크기 입력  
		int n=sc.nextInt(); 
		//3.배열의 크기를 지정할 수 있다. int[n]의 값을 kors에 할당
		kors=new int[n]; 
		//4. 콘솔창에 입력한 kors=int[n]배열의 수 출력 
		System.out.println(kors.length);  
										 //kors는 int[]이라고 위에서 선언 
										 //int[n] = kors[]
									     //Ex) int[5] = kors[5]
		
	
		//5,6,7은 세팅 클래스에 => 값이 정해지지 않은 문자열 names배열 선언 메소드  
		//8.Mun4의 init 메소드의 (int n)에 [n] 할당 Ex)[5]
		m4.init(n);  
		
		//9,10,11은 세팅 클래스에 => Scanner를 이용하여 names배열에 이름을 입력하는 메소드
		
		//m4.input(); //12. input메소드 실행명령 
		
		//13,14,15는 세팅 클래스에 => 1명의 사람을 선택하여 이름을 리턴해주는 메소드
		
		String names=m4.getName();//16.getName 메소드를 names에 대입해서 실행 
		System.out.println("오늘의 당첨자 : "+names); 
	

	}

}
