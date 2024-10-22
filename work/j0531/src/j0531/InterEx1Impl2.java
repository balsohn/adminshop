package j0531;

public class InterEx1Impl2 implements InterEx1{
	
	int a;
	int b;
	int hap;
	
	public void hap()
	{
		a=1;
		b=100;
		
		for(int i=a; i<=b; i++)
		{
			hap=hap+i;
		}
		System.out.println(hap);
	}

}
