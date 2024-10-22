package j0520;


public class Fifth {

		//하나의 클래스에 3개의 메소드를 만드시오
		//1부터 100까지의 합을 구해주는 프로그램
		//1부터 n까지의 합을 구해주는 프로그램
		//a부터 b까지의 합을 구해주는 프로그램
		
		int a,b,n,sum; //sum 동일한 변수를 사용할 경우 초기화를 시켜줘야한다. 
	
		public void cal1()
		{
			sum=0;  //동일한 변수를 사용할 경우 초기화를 시켜줘야한다. 
			for(int i=1; i<=100; i++ )
				sum=sum+i;
			
			System.out.println("1부터 100까지 합은 : "+ sum);
		}
		
		public void cal2()
		{
			sum=0;		//동일한 변수를 사용할 경우 초기화를 시켜줘야한다. 
			for(int i=1; i<=n; i++)
				sum=sum+i;
			System.out.println("1부터 "+n+"까지 합은 : "+ sum);
		}
		
		public void cal3()
		{
			sum=0;		//동일한 변수를 사용할 경우 초기화를 시켜줘야한다. 
			for(int i=a; i<=b; i++)
				sum=sum+i;
			System.out.println(a+"부터 " +b+ "까지 합은 : " + sum);
		}

	
}
