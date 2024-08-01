package sec01.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/_Temp/test.db");
		int cnt = 0;
		
		byte[] buf = new byte[5];
		
		int data = is.read(buf, 2,3);
//		while (true) {
//			++cnt;
//			int data = is.read(buf);
//			if (data == -1)
//				break;
//			System.out.println(data);
			for(int i=0;i<buf.length;i++) {
				System.out.println(buf[i]);
			}
//		}
//		System.out.println(cnt);
		is.close();
	}
}
