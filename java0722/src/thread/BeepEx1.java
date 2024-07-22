package thread;

import java.awt.Toolkit;

public class BeepEx1 {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			tk.beep();
			System.out.println("띵1");
			try {
				Thread.sleep(500);
			} // 1000->1초
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

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
