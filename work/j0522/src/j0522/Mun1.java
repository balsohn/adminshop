package j0522;

public class Mun1 {
	//----------------------------속성과 메소드--------------------------//
	//클래스 {}에서 선언된 변수를 속성이라 한다.
	
	//속성을 무조건 만들어야 하느냐? 만드는 사람 맘대로 
	//어떤 경우에 속성으로 해야 될까? 하나 이상의 메소드에서 값을 사용할때 
	
	//[1]점수를 매개변수로 전달하면 성적(A,B,C,D,F)로 리턴해주는 메소드 
	//[2]a와 b의 두수를 매개변수로 전달하면 a~b사이의 임의의 수를 리턴해주는 메소드
	//[3]a와 b의 두수를 매개변수로 전달하면 a에서 b까지의 합을 리턴해주는 메소드
	//[4]국,영,수 세과목의 점수를 매개변수로 전달하면 평균과 합계를 리턴해주는 메소드
	
	//전역변수, 지역변수
	//변수의 선언(자료형 변수명)이 발생한 {}를 벗어나면 사라진다.. 
	
	
	
	//[1]

	public String check(int scr)
	{
		//성적을 확인하는 순간 return하는 방법	
		if(scr>=90)
			return "등급은 : A 입니다.";
		else if(scr>=80)
			return "등급은 : B 입니다.";
		else if(scr>=70)
			return "등급은 : C 입니다.";
		else if(scr>=60)
			return "등급은 : D 입니다.";
		else
			return "등급은 : F 입니다.";	
		}

	//변수에 일단 모았다가 마지막에 return하는 방법
	//return "???"; 
	/*
	public String sungjuck(int jumsu)
	{
	String sung;

	if(jumsu>=90) {
		sung= "등급은 : A 입니다.";
	}else if(jumsu>=80) {
		sung=  "등급은 : B 입니다.";
	}else if(jumsu>=70) {
		sung= "등급은 : C 입니다.";
	}else if(jumsu>=60) {
		sung=  "등급은 : D 입니다.";
	}else {
		sung="등급은 : F 입니다.";	
	}
	//변수에 저장할 경우에는 추가적인 프로그램동작이 가능하다 
	return sung;
	}
	*/

	//[2]
 	public int randomNumber(int a, int b)
 	{
 		//n은 총 개수 
 		//Math.random()*n=> (0~n-1사이의 실수) => 정수형 (0~n-1)=> +1 => 1~n
 		//int num=(int)(Math.random()*(b-a+1))+a; 아래 한  줄로 만드는 방법
 		//return num;
 		
 		if(a>b)
 		{
 			int c;
 			c=a;
 			a=b;
 			b=c;
 		}
 		return (int)(Math.random()*(b-a+1))+a;		
 	}
 	
 	
	//[3]
	public int hap2(int a, int b)
	{				
		int hap=0;
		if(a>b) //2개의 수 사이에서 큰 값이 먼저 나와도 큰 수부터 작은수까지 더하는 로직. 
 		{
 			int c;
 			c=a;
 			a=b;
 			b=c;
 		}

		for(int i=a; i<=b; i++)
		{
			hap=hap+i;
		}
		System.out.println("a부터 b까지의 합은: " +hap);
		System.out.println("======================");
		
		return hap;
	}
	
	//[4]국,영,수 세과목의 점수를 매개변수로 전달하면 평균과 합계를 리턴해주는 메소드
	/*
	int kor;
	int eng;
	int mat;
	
	public void input(int kor, int eng, int mat)
	{
	 this.kor=kor;
	 this.eng=eng;
	 this.mat=mat;
	
      this.sumavg();
	}
	
	public void sumavg()
	{
		int sum2=kor+eng+mat;
		System.out.println("국,영,수 세과목의 합은: " + sum2+"점 입니다.");
		System.out.println("국,영,수 세과목의 평균은: "+ (sum2/3)+"점 입니다.");
	}
	*/
	
	public int[] sungjuk(int kor, int eng, int mat)
	{
		int tot=kor+eng+mat;
		int avg=tot/3;
		
		int[] sungs=new int[2];
		sungs[0]=tot;
		sungs[1]=avg;
		
		return sungs;
	}
	

	
}
