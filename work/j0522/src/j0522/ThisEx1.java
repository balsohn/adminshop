package j0522;

public class ThisEx1 {
	
	//this: 해당 클래스를 가리키는 별칭
	//속성의 접근제한자를 외부에 함부로 못바꾸게 하기 위해
	//private 속성을 많이쓴다 => 다른 클래스에서 접근불가 not visible
	
	//private인 속성은 값을 어떻게 줄것인가?
	//public인 메소드를 이용한다! 
	
	private int kor;
	private int eng;
	private int mat;
	
	//이게 바로 public 메소드입니다. 
	public void input(int kor, int eng, int mat)
	{
		this.kor=kor; //kor=kor;로 작성하면 (kor=a;) 양쪽 모두 갈색.
		this.eng=eng; //차이점은 할당값 받아온 kor이 {}  안에 있는 kor에 값을 저장하고
		this.mat=mat; //이럴 경우 private의 kor은 값이 저장되지 않아 0으로 출력된다.		
	
		this.hap(); //메인 메소드에 te1.hap() 메소드를 입력하지 않아도
					//this를 사용하면 같은 클래스안의 다른 메소드를 불러올 수 있다.
	}
	
	/*
	 public void input(int a, int b, int c)
		kor=a; // kor는 private int kor과 동일한 파란색 
	 	eng=b; // a는 메인 메소드에서 할당값을 받아오고 {}안에서 kor 못찾으면
	 	mat=c; // 밖으로 나가서 private의 kor에 a의 값을 저장한다. 
	 */
	
	//합을 출력할 메소드 
	public void hap()
	{
		//합을 출력하라는 명령 
		System.out.println(kor+eng+mat);
	}
}
