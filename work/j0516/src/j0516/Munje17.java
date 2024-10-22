package j0516;

public class Munje17 {
   public static void main(String[] args) {
	// 2개의 임의의 숫자를 발생(1~100)
	// 높은수 부터 출력한다.
	   
	// 3개의 임의의 숫자를 발생(1~100)
	// 높은수 부터 출력한다. 
	   
	   
	   int a,b;
	   a=(int)(Math.random()*100)+1;
	   b=(int)(Math.random()*100)+1;
	   
	   if(a>b)
	   {
		   System.out.println(a+" "+b);
	   }
	   else
	   {
		   System.out.println(b+" "+a);
	   }
	  
	   
	   int c,d,e; //3개의 임의의 숫자를 발생(1~100)
	   c=(int)(Math.random()*100)+1;
	   d=(int)(Math.random()*100)+1;
	   e=(int)(Math.random()*100)+1;
	   
	   
	   //높은수 부터 출력한다. 
	   if(c>d) //c가 d보다 클 때 
	   {
		   if(d>e)
		   {
			   System.out.println(c+" "+d+" "+e);
		   }
		   else
		   {
			  if(c>e)
			  {
				  System.out.println(c+" "+e+" "+d);
			  }
			  else
			  {
				  System.out.println(e+" "+c+" "+d);
			  }
		   }
	   }
	   else //d가 c보다 클 때 
	   {
		   if(d>e)
		   {
			   if(c>e)
			   {
				   System.out.println(d+" "+c+" "+e);
			   }
			   else
			   {
				   System.out.println(d+" "+e+" "+c);
			   }
		   }
		   else //e가 d보다 클 때 
		   {
			   System.out.println(e+" "+d+" "+c);
		   }
	   }
	
}
}
