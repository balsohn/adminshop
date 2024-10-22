package j0521;

public class Sungjuk_xo {
	
	public String check2(int kor)
	{
		if(kor>=90)
			return "수";
		else if(kor>=80)
			    return "우";
		     else if(kor>=70)
		    	     return "미";
		          else if(kor>=60)
		        	       return "양";
		               else
		            	   return "가";
	}
	
	public String jumsu3()// 매개변수 X , 리턴값 O
	{
		int kor1=90;
		int kor2=88;
		int kor3=78;
		
		String jum1=check2(kor1);
		String jum2=check2(kor2);
		String jum3=check2(kor3);
		
		 
		return jum1+" "+jum2+" "+jum3;
	
	}
	public static void main(String[] args) {
	
		Sungjuk2 sj=new Sungjuk2();
		System.out.println("매개변수 X 리턴값 O입니다");
		
		String aa=sj.jumsu3(); //jumsu3메소드를 호출해서 리턴 값의 결과 출력 
		System.out.println(aa);

	}

}
