package java0710;

import java.util.Scanner;

public class Prob4 {
	public static int maxNum(int x, int y, int z) {
		int mx = x;
		if (y > mx) {
			mx = y;
		}
		if (z > mx) {
			mx = z;
		}
		return mx;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 숫자를 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.printf("최대값은 %d\n",maxNum(a, b, c));
	}
}
