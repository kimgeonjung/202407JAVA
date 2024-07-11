package test;

/**
 * 1부터 100까지의 합 출력
 */
public class Test2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
