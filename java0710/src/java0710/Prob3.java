package java0710;

import java.util.Scanner;

/**
 * 로직에서 UI는 빼는게 좋다!
 */
public class Prob3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		int i1 = 0;
		int i2 = 0;
		int result = 0;

		for (;;) {
			System.out.print("숫자1 입력: ");
			str1 = sc.nextLine();
			System.out.print("숫자2 입력: ");
			str2 = sc.nextLine();

			i1 = Integer.parseInt(str1);
			i2 = Integer.parseInt(str2);

			if (i1 == i2) {
				result = 0;
			} else if (i1 > i2) {
				result = i1;
			} else {
				result = i2;
			}
			System.out.println(result);
		}

	}
}
