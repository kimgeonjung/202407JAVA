package thread;

import java.awt.Toolkit;

public class BeepEx2 {
	public static void main(String[] args) {
		Thread thread = new Thread(new BeepTask());
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
