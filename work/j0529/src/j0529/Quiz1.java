package j0529;

public  class Quiz1 extends AbstractEx {
    // AbstractEx 클래스를 상속받아서 calc()함수를 오버라이딩(재정의) 하시오
	// 단 국영수의 평균을 구하는 기능으로 재정의 하시오
	
	int mat;
	int avg;
	public void input2 (int mat)
	{
		this.mat=mat;
	}
	
	public void calc()
	{
		avg=(kor+eng+mat)/3;
		System.out.println(avg);
	}
}
