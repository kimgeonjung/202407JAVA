package java0710;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("명령>>");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("q")) {
				break;
			}
		}
		System.out.println("종료");
	}

}
