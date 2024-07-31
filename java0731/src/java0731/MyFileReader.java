package java0731;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("c:/_Temp/text/file2.txt");
		char[] buffer = new char[100];

		int readCharNum = reader.read(buffer);
		if (readCharNum != -1) {
			for (char ch : buffer) {
				System.out.print(ch);
			}
			System.out.println();
		}
		reader.close();
	}
}
