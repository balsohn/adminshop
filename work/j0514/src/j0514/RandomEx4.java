package j0514;

import java.util.Random;

public class RandomEx4 {

	public static void main(String[] args) {
	
		Random ran=new Random();
		
		for(int i=1;i<=6;i++)
		{
			
			int num=ran.nextInt(45)+1;
			
			System.out.print(num+ " ");
		}
		

	}

}
