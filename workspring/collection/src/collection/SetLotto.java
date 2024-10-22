package collection;

import java.util.HashSet;

public class SetLotto {
	public static void main(String[] args) {
		
		HashSet<Integer> lotto=new HashSet<Integer>();
		int leng=6;
		
		
		
		while(lotto.size()<6) {
			int num=(int)(Math.random()*45)+1;
			lotto.add(num);
			System.out.print(num+" ");
		}
		
		System.out.println(lotto.toString());
	}
}
