package thread;

public class ThreadExTwo extends Thread {
	public void run() {
		for(int i=1;i<100;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("새 작업 "+i+"번째");
		}
	}
}
