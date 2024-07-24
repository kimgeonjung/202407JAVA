package java0723;

public class Outter {
	public void method2(int arg) {
		int localVariable = 10;
		
//		arg = 100;
//		localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
				System.out.println(result);
			}
		}
		
		Inner in = new Inner();
		in.method();
	}
	
	
}
