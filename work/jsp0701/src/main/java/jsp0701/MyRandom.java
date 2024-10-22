package jsp0701;

public class MyRandom {

	private int[] lotto=new int[6];
	private String bunho="";
	
	public void initRandom()
	{
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
		}
	}
	
	public String getRandom()
	{
		for(int i=0;i<lotto.length;i++)
		{
			bunho+=lotto[i]+" ";
		}
		return bunho;
	}
}
