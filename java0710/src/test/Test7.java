package test;

import java.util.Scanner;

public class Test7 {
//	public static int getNum(String msg, Scanner scan) {
//		System.out.print(msg);
//		String input = scan.nextLine();
//		return Integer.parseInt(input);
//	}
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			String choice = sc.nextLine();
			
			switch (choice) {
			case "1":
				System.out.println("예금액>10000");
				break;
			case "2":
				System.out.println("출금액>2000");
				break;
			case "3":
				System.out.println("잔고>8000");
				break;
			case "4":
				run = false;
			}
		}

		System.out.println("프로그램 종료");

	}

}
