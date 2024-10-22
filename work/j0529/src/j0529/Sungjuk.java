package j0529;

//pass변수: 과목별 합격점수
//현재클래스: isPass()에 점수를 매개변수로 보내면 합격, 불합격 

public class Sungjuk {
	
	int pass;
	Sungjuk (int pass)
	{
		this.pass=pass;
	}
	
	//주로 사용하는 합격점수가 60점이라면 
	Sungjuk()
	{
		this.pass=60;
	}
	
	public void isPass(int kor)
	{
		if(kor>=pass)
		{
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
	}
}
