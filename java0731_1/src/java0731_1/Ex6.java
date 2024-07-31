package java0731_1;

import java.util.Date;

public class Ex6 {
	public static void method1(Object object) {
		switch (object) {
		case Integer i -> System.out.println(i);
		case String s -> System.out.println("\"" + s + "\"");
		case null, default -> System.out.println("unknown");
		}
	}

	public static void main(String[] args) {
		method1(100);
		method1(null);
		method1(new Date());
		method1("10");
	}
}
