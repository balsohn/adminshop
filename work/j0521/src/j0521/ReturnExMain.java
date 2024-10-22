package j0521;

public class ReturnExMain {

	public static void main(String[] args) {
	
		ReturnEx re=new ReturnEx();
		
		//re.average(60, 70, 80);
		
		//3명의 학생의 평균을 각각 구한뒤 전체 평균을 구하시오 
		
		
		int a1=re.average(80, 70, 90);
		int a2=re.average(60, 80, 90);
		int a3=re.average(60, 50, 90);
		
		int avg=(a1+a2+a3)/3;
		
		System.out.println("3명의 성적평균 : "+avg );
	}

}
