package j0529;

public class Quiz1Main {

	public static void main(String[] args) {
		// 국영수 성적을 입력하고
		Quiz1 q1=new Quiz1();
		
		q1.input(100, 80);
		q1.input2(80);
		
		// 평균을 출력하시오
		q1.calc();
		

	}

}
