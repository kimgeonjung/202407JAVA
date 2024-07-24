package lambda;

public class Ex2 {
	public static void main(String[] args) {
		MyInterface1 interface1 = () -> System.out.println("method()");
		interface1.method();
	}
}
