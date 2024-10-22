package j0522;

import java.util.Scanner;

public class Mun3Main {

	public static void main(String[] args) {
		//5명의 이름과 5명의 국어 점수를 Scanner로 입력받는다
		//Mun3의 메소드를 이용하여 수,우,미,양,가를 구한다
		//5명의 이름과 국어점수의 성적을 출력한다. 
		
		Mun3 m3=new Mun3();
		Scanner sc=new Scanner(System.in);
		
	
		String[] name=new String[5]; //이름을 받을 문자열 선언 
		int[] num=new int[5];		//성적을 받을 정수 선언 
		
		for(int i=0; i<name.length; i++) // 이름과 성적을 (이름길이만큼)배열의 값에 할당하겠다는 출력 
		{								//name.length = String[5] = i<=5
			System.out.print("이름 : "); //콘솔에 이름 입력 
			name[i]=sc.next();
			System.out.print("성적 : "); //콘솔에 성적 입력 
			num[i]=sc.nextInt();
		}
		
		/*
		String jumsu1=m3.check2(num[0]);
		String jumsu2=m3.check2(num[1]);
		String jumsu3=m3.check2(num[2]);
		String jumsu4=m3.check2(num[3]);
		String jumsu5=m3.check2(num[4]);
		*/
		
		String[] jumsu=new String[5]; // 점수배열 선언.  
		
		for( int i=0; i<jumsu.length; i++)
		{
			jumsu[i]=m3.check2(num[i]); //check2(int kor)에 check2(num[i])을 할당 
										//점수배열과 성적배열의 순서가 동일하다고 한다면 
		}
		
		for(int i=0; i<jumsu.length; i++)
		{
			System.out.println(name[i]+jumsu[i]); //이름배열과 점수배열의 순서에 맞게 출력 
		}
		
		
		/*
		Scanner sc=new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		int score=sc.nextInt();
		
		String grade=m3.check2(score);
		
		System.out.println("등급은 : "+grade +"입니다.");
		*/
	}

}
