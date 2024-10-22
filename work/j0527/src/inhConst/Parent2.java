package inhConst;

public class Parent2 {

	int pass; //합격의 기준점수 
	
	Parent2(int pass) //setter 
	{
		this.pass=pass;
	}
	
	public void isPass(int kor) {
		
		if(kor>=pass) {
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}
	}
	
}
