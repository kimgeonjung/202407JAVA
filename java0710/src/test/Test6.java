package test;

import java.util.Scanner;

/**
 * 구구단 출력(단 입력받아서)
 */
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요: ");
		String input = sc.nextLine();
		int dan = Integer.parseInt(input);

		System.out.printf("구구단 %d단: \n", dan);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
	}
}
