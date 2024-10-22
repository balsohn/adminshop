package j0521;

public class Sungjuk_oo {
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
	
	public String jumsu4(int kor1,int kor2,int kor3)// 매개변수 O , 리턴값 O
	{
		
        String jum1=check2(kor1);
		String jum2=check2(kor2);
		String jum3=check2(kor3);
		
		return jum1+" "+jum2+" "+jum3;
	
	}
	
	public static void main(String[] args) {
		Sungjuk2 sj=new Sungjuk2();
		System.out.println("매개변수 O 리턴값 O입니다");
		
		String bb=sj.jumsu4(90,88,78);
		System.out.println(bb);

	}

}
