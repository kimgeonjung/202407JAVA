package lambda;

public class Ex4 {
	public static void main(String[] args) {
		MyInterface3 interface3 = (x, y)->{
			System.out.println(x+y);
		};
		interface3.method(100, 300);
	}
}
