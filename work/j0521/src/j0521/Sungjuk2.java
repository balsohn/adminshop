package j0521;

public class Sungjuk2 {

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
	
	public void jumsu2(int kor1,int kor2,int kor3)// 매개변수 O , 리턴값 X
	{
		check1(kor1);
		check1(kor2);
		check1(kor3);
	}
	
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
	public String jumsu4(int kor1,int kor2,int kor3)// 매개변수 O , 리턴값 O
	{
		
        String jum1=check2(kor1);
		String jum2=check2(kor2);
		String jum3=check2(kor3);
		
		return jum1+" "+jum2+" "+jum3;
	
	}
}

