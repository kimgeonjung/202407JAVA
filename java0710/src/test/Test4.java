package test;

/**
 * 1부터 100까지 짝수의 합계를 출력
 */
public class Test4 {
	public static void main(String[] args) {
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			}
		}
		System.out.print(sum1);
	}
}
