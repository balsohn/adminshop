package j0514;

public class forEx1 {

	public static void main(String[] args) {
		// 반복문 : for (횟수를 알수 있는) ,while(횟수를 알지 못하는)
		
		//for : 동일한 동작을 계속 할 경우 반복코드문을 이용하여 코드를 줄이는 효과 
		
		//"안녕하세요"를 10번 실행 출력하세요.
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		//동일한 동작을 위한 반복문 for를 만들었다
		//형식
		/*
		for(초기값;조건식;증가값)
			
		{
			//반복문장;
		}
		
		1.초기값 2. 조건식 참=> 반복문 3.증가값 4.조건식 참=> 반복문 5.증가값 6.조건식 참=>반복문 7.증가값 8.조건식 참=>반복문 
		              거짓=> 종료  
		
		*/
		
		// 10번 실행 //변수명을 왜 i라고 할까
		//옛날부터 관습적인 표현 => i j k l m n
		
		for(int i=1;i<=5;i++) //i=i+1
		{
			 System.out.println("안녕하세요"+i);
		}
		
		
		
		
	}

}
