package java0716;

public class ColorPoint extends Point{

	
	public ColorPoint() {
		super();
		System.out.println("자식");
		System.out.println(++x);
	}

	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	@Override
	void method1() {
		System.out.println("자식오버라이딩");
		super.method1();
	}
	
}
