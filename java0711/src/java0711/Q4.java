package java0711;

import java.util.Scanner;

/**
 * 1부터 n까지의 합과 그 값을 구하는 과정을 출력 
 */
public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 n까지의 합");

		int sum = 0;
		System.out.print("숫자: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.printf("%d", i);
			if (i < n) {
				System.out.print("+");
			}
		}
		System.out.printf("=%d", sum);
	}
}
