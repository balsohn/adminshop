package Quiz;

import java.util.Scanner;

public class Quiz1 {

		//quiz : 사용자가 콘솔에 입력한 후에 
		//		특정문자의 갯수를 가져오는 메소드 만들기 
		
		//특정문자는 일단 임의로 지정하세요
		String str; //콘솔에 입력될 문자열
		String chk="P"; //특정문자 
		int num; 	//특정문자 갯수 
		
		public void charCount()
		{
			Scanner sc= new Scanner(System.in);
			str=sc.nextLine(); //스페이스  포함  
			
			for(int i=0; i<str.length(); i++)
			{
				String ch=str.substring(i,i+1);
				if(chk.equals(ch))
				{
					num++;
				}
			}
			
		}
		public void output ()
			{
				System.out.println(num);
			}
			
		}
	


