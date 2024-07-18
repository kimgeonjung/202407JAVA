package java0716;

import lombok.AllArgsConstructor;

public class Point {
	int x, y;

	public Point() {System.out.println("부모");}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	void method1() {
		System.out.println(x + "," + y);
	}
}
