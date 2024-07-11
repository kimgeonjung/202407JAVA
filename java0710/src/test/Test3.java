package test;

/**
 * 1부터 10까지의 짝수 출력
 */
public class Test3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
