package j0528;

public class StringEx5 {

	public static void main(String[] args) {

	String str="학교 종이 땡땡땡 어서 모이자 선생님이 우리를 기다리신다";
	
	//replace
	
	String str2=str.replace("학교","호프집");
	//System.out.println(str2);
	
	String str3=str.replace("땡땡땡", "땅땅땅");
	//System.out.println(str3);

	//trim : 비어있는 문자를 없애기 (단 문자열 내부는 처리못함)
	String aaa="		하하하 오늘은 화요일 	 	";	
	System.out.println(aaa);

	
	String a1=aaa.trim(); //앞 뒤 공백 삭제 
	System.out.println(a1);
	
	String name="Park kichan";
	String n1=name.toUpperCase(); //전체 대문자로 
	String n2=name.toLowerCase(); //전체 소문자로 
	
	System.out.println(n1 +" "+n2);
	
	}

}
