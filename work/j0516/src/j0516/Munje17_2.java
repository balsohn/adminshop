package j0516;

import java.util.Arrays;

public class Munje17_2 {

	public static void main(String[] args) {
		//Array.sort()를 이용해 오름차순으로 정렬하기
		
		// 3개의 임의의 숫자를 발생(1~100)
		// 높은수 부터 출력한다. 
		
		int[] nums=new int[10];			//배열 10개 인덱스 생성 
		
		for(int i=0; i<nums.length; i++) //1~10번 인덱스 
		{
			nums[i]=(int)(Math.random()*100)+1; //1~100의 번호를 num에 할당 
		}
		
		for(int i=0; i<nums.length; i++) // 
		{
			System.out.print(nums[i]+ " ");
		}
		System.out.println();
		
		Arrays.sort(nums); //nums 배열이 정렬된다 
		
		for(int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i]+ " ");
		}

	}

}
