package thread2;

public class Th1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("삑");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
