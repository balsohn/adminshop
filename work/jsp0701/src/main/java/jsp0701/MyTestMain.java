package jsp0701;

public class MyTestMain {

	public static void main(String[] args) {
		 
        MyTest mt=new MyTest();
        
        mt.input(80, 90, 70);
        mt.cal();
        
        int hap=mt.getHap();
        int avg=mt.getAvg();
        
        System.out.println("합 : "+hap);
        System.out.println("평균 : "+avg);
	}

}
