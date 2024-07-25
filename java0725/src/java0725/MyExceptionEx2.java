package java0725;

class MyClass2{
	void method() throws MyException2 {
		throw new MyException2("예외");
	}
}

public class MyExceptionEx2 {
	public static void main(String[] args) {
		MyClass2 class1 = new MyClass2();
		class1.method();
		
	}
}
