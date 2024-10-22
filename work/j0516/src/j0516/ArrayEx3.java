package j0516;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 배열의 속성 => length(크기)
		
		int[] kors=new int[5];  // int[ 총 개수 ]
		
		System.out.println(kors.length);
		
		//배열의 크기를 for문의 조건식에 자주 사용한다.
		
		for (int i=0; i<=4; i++)  // i<= 총 개수 - 1; 0부터 시작. 
		{
			
			kors[i]=99;
		}
		
		for (int i=0; i<kors.length; i++)
		{
			System.out.println(kors[i]);
		}

	}

}
