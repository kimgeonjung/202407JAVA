package drive;

import java.io.BufferedReader;
import java.io.FileReader;

import board.BoardDAO;
import board.BoardDTO;

public class ReadEx {
	public static void main(String[] args) throws Exception {
		String line = "";
		BoardDAO dao = new BoardDAO();
		BufferedReader br = new BufferedReader(new FileReader("c:/_Temp/board1.csv"));
		
		while ((line = br.readLine()) != null) {
			String[] data = line.split(", ");

			BoardDTO dto = new BoardDTO(0, data[0], data[1], data[2], null, 0);
			System.out.println(dto);
			dao.insertBoard(dto);
		}

		br.close();
	}
}
