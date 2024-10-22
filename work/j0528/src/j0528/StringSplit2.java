package j0528;

public class StringSplit2 {

	public static void main(String[] args) {
		
		String str="홍길동/배트맨/슈퍼맨/뽀로로/차탄/차형사/원더우먼";
		
		String[] names=str.split("/");
		for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]); //[0]부터  n까지 순서대로 출력
		}
		

	}

}
