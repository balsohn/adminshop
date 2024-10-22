package j0528;

public class StringIndex {

	public static void main(String[] args) {

		//IndexOf(), lastIndexOf()
		//문자열(Index)에서 찾고자 하는 문자열의 위치를 알기 위한 메소드
		//0부터~
		//문자열은 생성시 자동으로 인덱스가 생긴다.
		
		String str="학교종이 땡땡땡 어서모이자 선생님이 우리를 기다리신다";
		
		//문자열 메소드는 문자열 객체변수 뒤에 .(도트)뒤에 메소드를 적는다 
		//"작업할 문자열".메소드, 변수명.메소드
		
		/*
		str.메소드;
		==
		"학교종이 땡땡땡 어서모이자 선생님이 우리를 기다리신다".메소드;
		*/
		
		//메소드에 마우스를 올리면 반환할 자료형을 알려준다
		//[1]indexOf 한글자 이상 단일한 글자 혹은 문자열 
		//한글자 이상은 첫 글자의 위치를 알려준다.  
		int aa=str.indexOf("우리"); 
		System.out.println(aa);
		
		//[2]indexOf문자열 내에 동일한 글자가 있을 경우 첫 글자의 위치를 알려준다. 
		int b=str.indexOf("이"); 
		System.out.println(b);
		
		//[1]lastIndexOf는 문자열 내에 동일한 글자가 있을 경우 마지막 글자의 위치를 알려준다. 
		int z=str.lastIndexOf("이");
		System.out.println(z);
		
		//quiz : 사용자가 콘솔에 입력한 후에 특정문자의 갯수를 가져오는 메소드 만들기 

		int s=str.indexOf("박"); //찾는 문자열이 없다면 리턴값은 -1이다. 
		System.out.println(s);
		
	}

}
