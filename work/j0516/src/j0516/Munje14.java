package j0516;



public class Munje14 {
    public static void main(String[] args) {
		// 1부터 45까지의 임의의 수를 6개를 배열에 저장하기
    	// 저장된 배열의 값의 합을 출력하기
    	
    	int[] list=new int[6];
    	int sum=0;
    	
    	for(int i=0; i<list.length; i++) {
    		list[i]=(int)(Math.random()*45)+1;
    		//sum=sum+list[i];	
    	}
    		System.out.println(sum);
    	
    	int hap=0;
    	
    	for(int i=0; i<list.length; i++) {
    		
    		hap=hap+list[i];	
    	}
    	System.out.println(hap);
	}
}
