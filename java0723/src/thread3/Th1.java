package thread3;

import java.time.LocalTime;

public class Th1 extends Thread {

	@Override
	public void run() {
		LocalTime localTime = LocalTime.now();
		System.out.printf("%02d:%02d:%02d\n", localTime.getHour(), localTime.getMinute(), localTime.getSecond());

	}

}
