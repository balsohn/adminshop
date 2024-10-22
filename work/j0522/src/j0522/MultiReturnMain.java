package j0522;

public class MultiReturnMain {

	public static void main(String[] args) {
	
		MultiReturn mr=new MultiReturn(); 			//new MultiReturn클래스를 
													//mr.로 생성하겠다. 
		
		String ret=mr.test1();  					//mr.test1의 메소드 
		System.out.println(ret);
		
		
		
		//--------------문자열 메소드 실행 후 문자열 나누는 방법----------------//
		//------------------ret.split("/");-----------------------//
		/* 
		//ret 문자열에서 "/"를 구분자하여 나눠라 <설계도에 문자열이 "/"로 나눠져 있어야함. 다른 아무문자도 가능.
		//ret.split("/");에서 Split에 마우스 올리면 String[]  
		//=ret를 배열ret[]로 만들어서 순서대로 출력 {100/80/79}
		*/
		
		//jumsu배열을 출력 
		String[] jumsu=ret.split("/");		//mr.test1=ret=jumsu=String[] Split
		for (int i=0; i<jumsu.length; i++)	//for문=> String[] jumsu= jumsu[i]
		{
			System.out.println(jumsu[i]);
		}
		
		System.out.println("===============");
		
		String ret2=mr.test2(); 					//mr.test2의 생성자 = ret3 =test2의 자료형은 String 
		System.out.println(ret2);
		
		String[] mem=ret2.split("/"); 			//mr.test2->mem->String[] split
		for(int i=0; i<mem.length; i++)			//for문 -> String[] mem-> mem[i]
		{
			System.out.println(mem[i]);			//mem[i]출력 
		}
		
		
		
		
	}

}
