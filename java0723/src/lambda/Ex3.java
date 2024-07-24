package lambda;

public class Ex3 {
	public static void main(String[] args) {
		MyInterface2 interface2 = x->{
			System.out.println(x);
		};
		interface2.method(100);
	}
}
