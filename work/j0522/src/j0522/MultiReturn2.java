package j0522;

public class MultiReturn2 {
	
	//[1]동일한 자료형일 경우 배열을 이용한다..
	
	public int[] test1()
	{
		int kor=99;
		int eng=77;
		int mat=88;
		
		int[] jumsu=new int[3];
		jumsu[0]=kor;
		jumsu[1]=eng;
		jumsu[2]=mat;
		
		return jumsu;
	}
	
	//[2]서로 다른 자료형일 경우 클래스를 이용한다.
	//Data Transfer Object => dto
	
	//클래스 이용 방법 : Member class에 속성 추가 메소드는 X (새로운 class file 생성)
	//Member class의 객체를 여기에 생성 =Member mem=new Member();
	//Name 메소드가 있는 곳에 객체 생성 후 (Member mem=mr2.test2();) 
	//객체를 넘겨서 출력  
	
	public Member test2()   //public접근제한 뒤에 int/String이 아닌 생성된 객체를 입력
	{
		int age=33;
		String name="배트맨";
		double weight=88.8;
		boolean chk=true;
		char k='A';
	
		Member mem=new Member(); //객체 생성
		mem.age=age; 			//객체. 불러오기 mem.(Member class 속성불러오기)
		mem.name=name;
		mem.weight=weight;
		mem.chk=chk;
		mem.k=k; //위의 char k='A'를 대입 
		
		return mem; 
	
	}
	
}
