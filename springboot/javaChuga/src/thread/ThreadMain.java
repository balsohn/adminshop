package thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		// 메인 스레드
		ThreadEx te=new ThreadEx();
		ThreadExTwo tetwo=new ThreadExTwo();
		ThreadExThree tethree=new ThreadExThree();
		
		// 우선순위 메소드
		te.setPriority(Thread.MAX_PRIORITY);
		tetwo
		
		
		te.start();
		
		for(int i=1;i<=100;i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i+"번째");
		}
	}
}
