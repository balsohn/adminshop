package j0528;

public class Test1 {

	public static void main(String[] args) {
		
		String str="학교종이 땡땡땡 어서모이자 이런! 이모 종각 종소리";
		System.out.println(str.length());
		//String aa=str.charAt(2);
		//String bb=str.substring(2,3);
		
		//System.out.println(aa);
		//System.out.println(bb);
		int num=0;
		char chk='종';
		//charAt로 문자 갯수 구하기
		for(int i=0; i<str.length(); i++)
		{
			//System.out.println(str.charAt(i));
			char ch=str.charAt(i);
			if(chk==ch)
			{
				num++;
			}
		}
		System.out.println(num);
	}

}
