package java0729;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex4 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd/hh:mm:ss");
		String strNow = sdf.format(date);
		System.out.println(strNow);
		
		LocalDateTime now = LocalDateTime.now();
		String strNow2 = DateTimeFormatter.ofPattern("yyyy.MM.dd/hh:mm:ss").format(now);
		System.out.println(strNow2);
		
	}
}
