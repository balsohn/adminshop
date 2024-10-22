package j0529;


//추상클래스 : 추상메소드를 포함하는 클래스
//추상메소드 : 메소드의 기능이 정의 되지 않은 클래스 => { }가 없다 
//추상메소드를 포함하는 메소드와 클래스는 abstract 키워드를 꼭 넣는다 
public abstract class AbstractEx {
	
	
	int kor;
	int eng;
	int hap;
	
	public void input(int kor, int eng)//변수의 초기화 
	{
		this.kor=kor;
		this.eng=eng;
	}
	
	public abstract void calc(); //클래스를 구성하면서 
	//메소드명은 정했지만 아직 어떤 작업을 할지 정하지 않은 것 

	
	
}
