package lambda;

public class Ex5 {
	public static void main(String[] args) {
		MyInterface4 interface4 = (x, y) -> x + y;

		int res = interface4.method(500, 200);
		System.out.println(res);
	}
}
