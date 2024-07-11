package java0711;

import java.util.Scanner;

public class Q5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 n까지의 합");

		int n = 0;
		do {
			System.out.print("n값: ");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 0; i < n / 2; i++) {
			System.out.print("+-");
		}
		if (n % 2 != 0) { //홀수면
			System.out.print("+");
		}
	}
}
