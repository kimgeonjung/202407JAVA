package drive;

import board.BoardDAO;

public class Ex5 {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		dao.deleteBoard(24);
		System.out.println("실행완료");
	}
}
