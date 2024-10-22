package j0514;

public class RandomEx3 {

	public static void main(String[] args) {
	
		 //Math.random 중요. 기본공식 다른 프로그램 Math실행가능 
		
		for(int i=1;i<=6;i++)
		{
	double num=Math.random()*45; // 0~45 사이의 실수  
	//0~1사이의 실수 
		//Math 메소드에 마우스를 올리면 유형이 나온다. double 
		
		//실수를 정수로 변환하기 위한 방법 
		int ran=(int)num; //0~44까지의 정수 
		ran=ran+1;         //1~45의 정수 

		System.out.print(ran+" ");
		
	}
/*	= (int)(Math.random()*10)+1;*/ //간단하게 만드는 방법 
}
}
