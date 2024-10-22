package j0531;

//interface를 사용하는 방법은 interface를 구현(implement)해서 사용한다.
public class InterEx1Impl implements InterEx1 {
	
	int kor;
	int eng;
	
	@Override
	public void hap() 
	{
		kor=90;
		eng=80;
		System.out.println(kor+eng);
	}

}
