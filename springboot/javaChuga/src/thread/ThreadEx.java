package thread;

public class ThreadEx extends Thread {

	// Thread클래스를 상속받은 클래스에 새로운 실행단위(thread)를 생성한다.
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
