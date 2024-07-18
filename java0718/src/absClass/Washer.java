package absClass;

public class Washer extends HomeAppliancies {
	
	@Override
	public void turnOn() {
		System.out.println("세탁기 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("세탁기 끄기");
	}
}
