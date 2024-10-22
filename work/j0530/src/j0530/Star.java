package j0530;

import java.util.Iterator;

public class Star {

	public static void main(String[] args) {
		
		/*
		for (int i=1; i<=13; i++) 
		{
			if(i<8)
			{
				for (int j=1; j<=i; j++) 
				{
					System.out.printf("%2s","*");
				}
				System.out.println();
			}
			else
			{
				for(int j=0; j<14-i; j++) 	//(int s=0; s<n; s++)
				{
					System.out.printf("%2s","*");
				}
				System.out.println();
			}
		}
		*/
		
		for (int i=1; i<=7; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.printf("%2s","*");
			}
			System.out.println();
		}
		
		
		
		
		
		
}
}