package java0723;

import java.time.LocalTime;

public class DisplayDateTime {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.printf("%02d:%02d:%02d\n", localTime.getHour(), localTime.getMinute(), 
				localTime.getSecond());
	}
}
