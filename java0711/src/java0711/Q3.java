package java0711;

import java.util.Scanner;

/**
 * 정수 a,  b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환 
 */
public class Q3 {
	public static int sumOf(int a, int b) {
		int sum = 0;
//		if (a > b) {
//			int temp = a;
//			a = b;
//			b = temp;
//		}
		int min, max;
		if(a<b) {
			min = a; max = b;
		}else {
			min = b; max = a;
		}
		
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 a ~ b까지의 합");
		
		System.out.print("숫자 a 입력: ");
		int i1 = sc.nextInt();
		System.out.print("숫자 b 입력: ");
		int i2 = sc.nextInt();

		System.out.println(sumOf(i1, i2));
	}

}
