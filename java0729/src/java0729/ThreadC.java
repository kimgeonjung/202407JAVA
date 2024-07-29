package java0729;

public class ThreadC extends Thread implements Runnable{
	public ThreadC() {
		setName("ThreadC");
	}
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"<- 출력 내용");
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
