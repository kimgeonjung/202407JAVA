package sec01.exam07;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadEx {
	public static void main(String[] args) throws Exception {
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader("c:/_Temp/board1.csv"));
		
		while ((line = br.readLine()) != null) {
			String[] data = line.split(", ");

			BoardDTO dto = new BoardDTO(0, data[0], data[1], data[2], null, 0);
			System.out.println(dto);
		}

		br.close();
	}
}