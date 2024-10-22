package j0516;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 배열의 존재하지 않는 인덱스를 사용한다면
		
		int[] kors=new int[5];
		

		kors[0]=100;
		kors[1]=88;
		kors[2]=99;
		kors[3]=66;
		kors[4]=57;
		kors[5]=90;
	
		for (int i=0; i<=5; i++)
		{
			kors[i]=99;
		}
		for (int i=0; i<=5; i++)
		{
			System.out.println(i);
		}
					
	}

}
