package java0711;

import java.util.Scanner;

/**
 * 작은 프로젝트1 
 * 회원가입기능 
 * 로그인기능 
 * 예금 출금 조회 종료기능 
 * 회원정보: 이름, 주민번호 6자리, 전화번호 
 * 로그인정보: 이름, 주민번호 6자리) 
 * 예금/출금 정보(잔고)
 */
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run1 = true;
		boolean run2 = true;
		int balance = 0;

		while (run1) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int mainMenu = Integer.parseInt(sc.nextLine());
			String id = "qwer";
			String pw = "123456";
			switch (mainMenu) {
			case 1:
				System.out.println("로그인 처리");
				System.out.print("아이디: ");
				String inputId = sc.nextLine();
				System.out.print("패스워드: ");
				String inputPw = sc.nextLine();
				
				if (inputId.equals(id) && inputPw.equals(pw)) {
					System.out.println("로그인 성공");
				} else if (inputId.equals(id) == false) {
					System.out.println("로그인 실패:아이디가 틀림");
				} else if (inputPw.equals(pw) == false) {
					System.out.println("로그인 실패:패스워드가 틀림");
				}
				break;
				
			case 2:
				System.out.println("회원 가입");
				System.out.println("[필수 정보 입력]");
				System.out.print("1. 이름: ");
				String id2 = sc.nextLine();
				System.out.print("2. 주민번호 앞 6자리: ");
				String pw2 = sc.nextLine();
				System.out.print("3. 전화번호: ");
				String pn = sc.nextLine();

				System.out.println("[입력된 내용]");
				System.out.println("1. 이름: " + id2);
				System.out.println("2. 주민번호 앞 6자리: " + pw2);
				System.out.println("3. 전화번호: " + pn);
				break;
				
			case 3:
				System.out.println("예금/출금");

				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum = Integer.parseInt(sc.nextLine());

					switch (menuNum) {
					case 1:
						System.out.print("예금액>");
						balance += Integer.parseInt(sc.nextLine());
						break;
					case 2:
						System.out.print("출금액>");
						balance -= Integer.parseInt(sc.nextLine());
						break;
					case 3:
						System.out.print("잔고>");
						System.out.println(balance);
						break;
					case 4:
						run2 = false;
					}
				}
				System.out.println("예금/출금 프로그램 종료");
				run2 = true;
				break;
				
			case 4:
				run1 = false;
			}
		}

		System.out.println("전체 프로그램 종료");

	}
}
