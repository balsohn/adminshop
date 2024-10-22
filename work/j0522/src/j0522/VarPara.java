package j0522;

public class VarPara {

	//매개변수로 넘어오는 값의 합계를 구하는 메소드
	//매개변수는 1,2,3,4 ~ 100 
	
	public void hap(int ...args)
	//						args는 임의로 설정 value도 가능 
	{
		System.out.println(args.length);
		int[] num=args;
		int hap=0;
		for(int n:args)// value가 비어있을때까지 계속 동작 
		{
			hap=hap+n;
		}
		
		System.out.println(hap);
		//출력 여러개 입력하면 반복해서 출력됨. 
	}
	
	
	
	
}
