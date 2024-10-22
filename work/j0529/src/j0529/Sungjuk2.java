package j0529;

public class Sungjuk2 {
	
	int kor, eng, mat;
	int hap, avg;

	//결석한 사람은 기본점수를 60점을 준다.
	
	//시험을 한번도 안 본 사람
	Sungjuk2()
	{
		//this.kor=60;
		//this.eng=60;
		//this.mat=60;
		this(60,60,60);
	}
	//시험을 국어만 본 사람 		(한 과목)
	Sungjuk2(int kor)
	{
		//this.kor=kor;
		//this.eng=60;
		//this.mat=60;
		this(kor,60,60);
	}
	//시험을 국어,영어만 본 사람	(두 과목)
	Sungjuk2(int kor, int eng)
	{
		//this.kor=kor;
		//this.eng=eng;
		//this.mat=60;
		this(kor,eng,60);
	}
	//시험을 국,영,수 본 사람 	(세 과목)
	Sungjuk2(int kor, int eng, int mat)
	{
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		//this(kor,eng,mat);
	}

	public void output()
	{
		int sum=kor+eng+mat;
		System.out.println("합은 :" + sum);
		int avg=sum/3;
		System.out.println("평균은 :" + avg);
	}
}
