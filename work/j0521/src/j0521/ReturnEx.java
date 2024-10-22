package j0521;

public class ReturnEx {
	
	//3과목의 평균을 구하는 함수
	/*
	public void average(int kor, int eng, int mat)
	{
		int avg=(kor+eng+mat)/3;
		System.out.println(avg);
	}
	*/
	
	public int average(int kor, int eng, int mat)
	{
		int avg=(kor+eng+mat)/3;
		return avg;	
	}
	
	//매개변수 x 리턴 x 
	//매개변수 x 리턴 o 
	//매개변수 o 리턴 x 
	//매개변수 o 리턴 o 
}