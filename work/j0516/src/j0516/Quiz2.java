package j0516;

import java.util.Random;

public class Quiz2 {

	public static void main(String[] args) {
	
		//정수 배열 크기가 6인 배열을 만드시오
		int[] count=new int[6];
		
		//1부터 45까지의 임의의 수를 배열해 하나씩 넣으시오
		
		/*
		Random random=new Random();
		for(int i=0; i<count.length; i++)
		{
			count[i]=random.nextInt(45)+1;
		}
		*/
		
		/* 원본 출력하기
		
		System.out.println("원본 순서: ");
		for( int num : count) {
			
			System.out.println(num+ " ");
		}
		*/
		
		for(int i=0; i<count.length; i++)
		{
			count[i]=(int)(Math.random()*45)+1;
		}
		
		//출력은 배열의 끝부터 (5번 인덱스) 출력하기
		System.out.print("5번 인덱스부터 출력 : ");
		for (int i=5; i>=0; i--) {
			System.out.print(count[i]+" ");
		}
		
		
		
	}

}
