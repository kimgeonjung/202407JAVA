package java0711;

import java.util.Scanner;

/**
 * +,-부호 번갈아 가며 n번 출력 
 */
public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 n까지의 합");

		int n = 0;
		do {
			System.out.print("n값: ");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
	}
}
