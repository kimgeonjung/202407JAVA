package java0718;

public abstract class Phone {
	String name;
	void turnOn() {
		System.out.println("켜");
	}
	abstract void turnOff();
}
