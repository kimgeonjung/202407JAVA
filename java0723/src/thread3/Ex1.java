package thread3;

import java.time.LocalTime;

public class Ex1 {
	public static void main(String[] args) {	
		Th1 th1 = new Th1();
		th1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("째깍");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
