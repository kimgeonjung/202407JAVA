package java0725;

class MyClass{
	void method() throws Exception {
		throw new Exception("예외");
	}
}

public class MyExceptionEx1 {
	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		try {
			class1.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
