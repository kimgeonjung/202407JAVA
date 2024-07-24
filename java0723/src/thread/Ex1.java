package thread;

public class Ex1 {
	public static void main(String[] args) {
		Thread th = new Thread(new Th1());
		th.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
