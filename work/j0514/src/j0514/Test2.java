package j0514;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		// 100~120까지의 임의의 수를 출력하시오
	
		int n=100;
		int m=120;
		
		int num=(int)(Math.random()*(m-n+1));
		num=num+n;

		System.out.println(num);
	}

}


/* 
0~10 => Math.random()*(11)=> 정수부분만처리 +0 
						가짓수
1~10 => Math.random()*(10) => 정수부분만처리 +1

11-20 => Math.random()*(10) => 정수부분(0~9)+11(초기값);
n-m   => Math.random()*(m-n+1)=> 정수부분 + n;

*/
