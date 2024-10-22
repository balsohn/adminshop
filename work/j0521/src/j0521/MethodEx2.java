package j0521;

public class MethodEx2 {
	//리턴값: 메소드가 실행하고 발생된 값을 전달해주는것 

	//메소드를 정의할때 리턴값의 유무를 표기
	//리턴값이 없으면 void
	//리턴갑이 있으면 리턴값의 자료형 
	public int hap()
	{
		int hap=0;
		for(int i=1; i<=100; i++)
		{
			hap=hap+i;
		}
		//1부터 100까지의 합은 여기 메소드에 있다	
		return hap;
		//return 값은 무조건 하나만 존재 
	}
	
	//리턴값 없는 메소드 
	public void hap2()
	{
		int hap=0;
		for(int i=1; i<=100; i++)
		{
			hap=hap+i;
		}
		System.out.println(hap);
	}
	
	
}
