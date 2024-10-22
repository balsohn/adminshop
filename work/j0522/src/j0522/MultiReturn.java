package j0522;

public class MultiReturn {
	   //-------서로 다른 자료형을 2개 이상 리턴----------// 
	
		//[1]문자열을 이용하는 방법 String 
	
	//1.동일한 자료형으로 2개 이상인 값을 리턴
	public String test1()
	{
		int kor=100;
		int eng=80;
		int mat=79;
		
		String ret=kor+"/"+eng+"/"+mat;
				// 100/80/79
		return ret;
	}

	//2.서로 다른 자료형으로 2개 이상 리턴
	public String test2()
	{
		int age=33;
		String juso="고양시";
		double height=180.5;
		
		String ret=age+"/"+juso+"/"+height;
		
		return ret;
	}
	
	
}
