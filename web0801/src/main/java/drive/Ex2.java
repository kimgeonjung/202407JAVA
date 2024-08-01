package drive;

import account.AccountDAO;
import account.AccountDTO;

public class Ex2 {
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		AccountDTO dto = new AccountDTO(0, "김씨", "1234", "010-0101-0101", 0);
		
		dao.register(dto);
		
		System.out.println("입력 성공");
	}
}
