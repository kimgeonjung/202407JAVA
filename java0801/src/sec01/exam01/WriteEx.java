package sec01.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("c:/_Temp/test.db");

		byte[] array = {10,20,30,40,50,60,70,80,90,100};
		
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;
//
//		os.write(a);
//		os.write(b);
//		os.write(c);
		os.write(array, 1,3);
		
		os.flush();
		os.close();
	}
}
