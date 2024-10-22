package j0528;

public class Test2 {

	public static void main(String[] args) {

		
		String str="학교종이 땡땡땡 어서모이자 이런! 이모 종각 종소리";
		
		String chk="종";		
		int num=0;
		
		//substring으로 문자를 잘라와서 갯수 구하기
		for(int i=0; i<str.length();i++)
		{
		String ch=str.substring(i,i+1);
			if(chk.equals(ch))
			{	//문자열 클래스 비교는 equals Not == 
				num++;
			}
			
		}
		System.out.println(num);
		}

}
