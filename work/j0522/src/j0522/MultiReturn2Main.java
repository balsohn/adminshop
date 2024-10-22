package j0522;

public class MultiReturn2Main {

	public static void main(String[] args) {
	
		MultiReturn2 mr2=new MultiReturn2(); //MultiReturn2를 new -> mr2 생성 
		
		/*	
		int[] jumsu=mr2.test1();		//배열값이 들어있는 test1() mr2=jumsu로 명명(임의설정가능)
		for(int i=0; i<jumsu.length; i++) //설계도의 int[] 속성을 불러온다 (배열이면 String)
		{
			System.out.println(jumsu[i]); //jumsu[i] jumsu[0]~ <jumsu[.length]까지
										  //설계도에 int[3]로 설정되어 있어서 그 값을 호출
		}
		*/
		
		Member mem=mr2.test2();   //MultiReturn2 class에 Member 생성자를 호출해서 생성 mr2.test()= mem  
		System.out.println("이름 : "+mem.name);
		System.out.println("나이 : "+mem.age);
		System.out.println("몸무게 : "+mem.weight);
		System.out.println("성인 : "+mem.chk);
		System.out.println("학점 : "+mem.k);
	}

}
