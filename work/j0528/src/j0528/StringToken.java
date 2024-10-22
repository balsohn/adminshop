package j0528;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {

		String str="홍길동/배트맨/슈퍼맨/뽀로로/차탄/차형사/원더우먼";
		
		StringTokenizer st=new StringTokenizer(str,"/");
		
		
		while(st.hasMoreTokens())  //꺼낼것이 있는가 
		{
			System.out.println(st.nextToken()); //꺼낼것이 있다 
		}
		
	}

}
