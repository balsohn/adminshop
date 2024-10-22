package j0521;

public class Sungjuk_xx {


	public void check1(int kor)
	{
		if(kor>=90)
			System.out.println("수");
		else if(kor>=80)
			     System.out.println("우");
		     else if(kor>=70)
		    	      System.out.println("미");
		          else if(kor>=60)
		        	       System.out.println("양");
		               else
		            	   System.out.println("가");
	}
	
	public void jumsu1()// 매개변수 X , 리턴값 X
	{
		int kor1=90;
		int kor2=88;
		int kor3=78;
		
		check1(kor1);
		check1(kor2);
		check1(kor3);
	}	
	
	public static void main(String[] args) {
	
		Sungjuk2 sj=new Sungjuk2();
		System.out.println("매개변수 X 리턴값 X입니다");
		sj.jumsu1();
	}

}
