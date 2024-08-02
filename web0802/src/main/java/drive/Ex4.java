package drive;

import board.BoardDAO;
import board.BoardDTO;

public class Ex4 {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = new BoardDTO(24, "김씨", "제목", "가나다라마바사", "", 0);
		
		dao.updateBoard(dto);
		System.out.println("수정완료");
	}
}
