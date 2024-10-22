package j0521;

public class Sungjuk {
	//메소드는 실행이 끝나면 메소드 내의 모든 내용은 사라진다. 
	//메소드 : 동작을 실행하는 것으로 동작을 위해 필요한 값 => 매개변수 
	//		 동작을 완료한 이후에 발생된 값을 이용하고자 하는 경우 => 리턴값
	
	//메소드를 정의할때 리턴값의 유무를 표기
		//리턴값이 없으면 void
		//리턴갑이 있으면 리턴값의 자료형 

	int kor;
	
	public void jumsu1() //매개변수 x, 리턴값 x 
	{
		
		int kor1=90;
		int kor2=88;
		int kor3=78;
		
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
	
	
	//매개변수명은 현재 메소드내에서 사용하는 이름으로 받는다
	public void jumsu2(int kor1, int kor2, int kor3 ) //매개변수 o, 리턴값 x 
	{
	
		if(kor1>=90)
	 		System.out.print("수");
		else if(kor1>=80)
			System.out.print("우");
		else if(kor1>=70)
			System.out.print("미");
		else if(kor1>=60)
			System.out.print("양");
		else 
			System.out.print("가");
	
		if(kor2>=90)
	 		System.out.print("수");
		else if(kor2>=80)
			System.out.print("우");
		else if(kor2>=70)
			System.out.print("미");
		else if(kor2>=60)
			System.out.print("양");
		else 
			System.out.print("가");
		
		if(kor3>=90)
	 		System.out.print("수");
		else if(kor3>=80)
			System.out.print("우");
		else if(kor3>=70)
			System.out.print("미");
		else if(kor3>=60)
			System.out.print("양");
		else 
			System.out.print("가");
	}
	
	public String jumsu3() //매개변수 x, 리턴값 o 
	{
	
		int kor1=90;
		int kor2=88;
		int kor3=78;
		
		String jum1,jum2,jum3;
		
		if(kor1>=90)
	 		jum1="수";
		else if(kor1>=80)
			jum1="우";
		else if(kor1>=70)
			jum1="미";
		else if(kor1>=60)
			jum1="양";
		else 
			jum1="가";
		
		if(kor2>=90)
	 		jum2="수";
		else if(kor1>=80)
			jum2="우";
		else if(kor1>=70)
			jum2="미";
		else if(kor1>=60)
			jum2="양";
		else 
			jum2="가";
		
		if(kor3>=90)
	 		jum3="수";
		else if(kor1>=80)
			jum3="우";
		else if(kor1>=70)
			jum3="미";
		else if(kor1>=60)
			jum3="양";
		else 
			jum3="가";
		
			return jum1+" "+jum2+" "+jum3;
			
	}
	public String jumsu4(int kor1, int kor2, int kor3) //매개변수 o, 리턴값 o
	{
		
		 String jum1,jum2,jum3;
			
			if(kor1>=90)
				jum1="수";
			else if(kor1>=80)
					jum1="우";
			     else if(kor1>=70)
			    	 	 jum1="미";
			          else if(kor1>=60)
			        	  	  jum1="양";
			               else
			            	  jum1="가";
			
			if(kor2>=90)
				jum2="수";
			else if(kor2>=80)
					jum2="우";
			     else if(kor2>=70)
			    	 	 jum2="미";
			          else if(kor2>=60)
			        	  	  jum2="양";
			               else
			            	  jum2="가";
			
			if(kor3>=90)
				jum3="수";
			else if(kor3>=80)
					jum3="우";
			     else if(kor3>=70)
			    	 	 jum3="미";
			          else if(kor3>=60)
			        	  	  jum3="양";
			               else
			            	  jum3="가";
			
			return jum1+" "+jum2+" "+jum3;
		
	
	}


	
	
	
}
