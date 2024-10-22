package j0528;

public class StringSub {

	public static void main(String[] args) {
		
		//substring(시작인덱스, 끝인덱스) :문자열을 자르기
		
		String str="학교종이 땡땡땡 어서모이자 선생님이 우리를 기다리신다";
		
		String cut=str.substring(0, 6);//인덱스 0번부터 인덱스 6번 앞에 문자까지 
		System.out.println(cut); //0번부터 5번까지 출력됨 
		
		String cut2=str.substring(5, 9); 
		System.out.println(cut2);
		
		System.out.println(str.indexOf("기"));
		
		String cut3=str.substring(24); 
		//인덱스값 하나만 있다면 인덱스부터 끝까지
		System.out.println(cut3);
		
		String cut4=str.substring(10); //9~끝까지 
		System.out.println(cut4);
		
		//String cut5=str.substring(10, 5); //indexOutOfBound 
		//System.out.println(cut5);
		
		
	}

}
