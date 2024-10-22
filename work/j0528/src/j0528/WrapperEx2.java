package j0528;

public class WrapperEx2 {

	public static void main(String[] args) {
		Byte b1=10;
		Short b2=100;
		Integer b3=200;
		Long b4=400L;
		Float b5=35.123F;
		Double b6=12.464;
		Boolean b7=true;
		
		
		int test=b1.intValue();
		double test2=b1.doubleValue();
			
		float inf=b3.floatValue(); //Integer를 float로 형 변환 
		//System.out.println(inf);
		
		String str=b4.toString(); //Long을 문자열로 형 변환 
		//System.out.println(str);
		
		//문자, 문자열을 숫자로 변환
		String num="9467"; 
		String kor="50";
		
		int num2=Integer.parseInt(num);
		int kor2=Integer.parseInt(kor);
		//System.out.println(num2+kor2);
	
	}

}
