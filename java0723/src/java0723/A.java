package java0723;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	static class B{
		void method() {
//			field1=10;
//			method1();
			
			field2=10;
			method2();
		}
	}
	
	public static void main(String[] args) {
		A.B b = new A.B();
//		A a = new A();
//		A.B b = a.new B(); B클래스가 스태틱이 아니면 A를 먼저 생성 해야 실행이 가능   
		b.method();
//		System.out.println(A.field2);
//		System.out.println(field1);
//		System.out.println(a.field1);
		
	}
}
