package java0709;
/**
 * 3개의 정수값을 받아서 최대값을 구하여 출력
 */

import java.util.Scanner;

public class Prob4 {
	public static int getNum(String msg, Scanner scan) {
		System.out.print(msg);
		String input = scan.nextLine();
		return Integer.parseInt(input);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = getNum("숫자 1 입력: ", sc);
		int y = getNum("숫자 2 입력: ", sc);
		int z = getNum("숫자 3 입력: ", sc);

		if (x == y && y == z) {
			System.out.println(0);
		} else if (x >= y && x >= z) {
			System.out.println(x);
		} else if (y >= x && y >= z) {
			System.out.println(y);
		} else {
			System.out.println(z);
		}

//		if (x > y) {
//			if (x > z) {
//				System.out.println(x);
//			} else if (z > x) {
//				System.out.println(z);
//			}
//		} else if (x < y) {
//			if (y > z) {
//				System.out.println(y);
//			} else if (z > y) {
//				System.out.println(z);
//			}
//		} else if (x == y) {
//			if (x > z) {
//				System.out.println(x);
//			} else if (x < z) {
//				System.out.println(z);
//			} else {
//				System.out.println(0);
//			}
//		}
	}
}
