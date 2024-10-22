package j0524;

public class VarArea {
		
		//1.전역변수 
		int num=100;
		int chk=88;
	
		
		public void test(int k)
		{
			//지역변수 
			int hap=0;
			int imsi=0,i;
			
			for(i=0; i<=100; i++)
			{
				imsi=99;
				
				hap=hap+i;
			
				System.out.println(i+" "+imsi);
			
			}
			System.out.println("============");
			System.out.println(i+" "+imsi); 
			System.out.println(k+" "+num); 
	
		}
	
		public void test2()
		{
			//k=100; test2() 또는 클래스{}에 k,hap 변수를 찾을 수 없음. 
			//hap=99;
			
			System.out.println(num+" "+chk);
		}
		
		
		
		
		
		
		
		
		
}
