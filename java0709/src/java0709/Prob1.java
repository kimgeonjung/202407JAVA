package java0709;

/**
 * 정수 x와 y의 값을 변경 
 */
public class Prob1 {
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("x:%d, y:%d\n", a, b);
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.printf("x:%d, y:%d\n", x, y);
		swap(x, y);
//		int temp = x;
//		x = y;
//		y = temp;
	}
}
