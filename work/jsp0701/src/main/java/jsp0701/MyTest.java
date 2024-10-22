package jsp0701;

// 속성, 메소드로 구성된 동작들을 정의
// 국,영,수 합계와 평균을 구하는 처리
public class MyTest {

	// 속성 : 변수
	private int kor,eng,mat;
	private int hap,avg;
	
	// 기능 : 메소드
	// 성적입력
	public void input(int kor,int eng,int mat)
	{
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	// 합계 + 평균
	public void cal()
	{
		hap=kor+eng+mat;
		avg=hap/3;
	}
	
	// 합계, 평균의 값을 전달하기
	public int getHap()
	{
		return hap;
	}
	public int getAvg()
	{
		return avg;
	}
}







