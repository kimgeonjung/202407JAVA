package thread;

public class Th1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("삑");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
