package java0731;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter2 {
	public static void main(String[] args) throws IOException {
		File dir = new File("c:/_Temp/file");
		if (dir.exists() == false) {
			dir.mkdir();
		}
		Writer writer = new FileWriter("c:/_Temp/file/data.txt");
		String str = "ABC 가나다";
		writer.write(str);
		writer.flush();
		writer.close();
	}
}