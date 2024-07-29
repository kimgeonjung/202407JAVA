package java0729;

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread mThread = Thread.currentThread();
		System.out.println("메인스레드 " + mThread.getName());

		ThreadA a = new ThreadA();
		System.out.println("작업스레드 " + a.getName());
		a.start();

		// 익명 자식 객체
		Thread b = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println(getName() + "<- 출력 내용");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		b.setName("ThreadB");
		System.out.println("작업스레드 " + b.getName());
		b.start();

		Thread c = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("ThreadC<- 출력 내용");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		c.setName("ThreadC");
		System.out.println("작업스레드 " + c.getName());
		c.start();
	}
}
