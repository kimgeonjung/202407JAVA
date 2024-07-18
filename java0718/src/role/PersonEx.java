package role;

public class PersonEx {

	public static void main(String[] args) {
		Driver d = new Driver();
		Role r = d;
		
		Person p = new Person();
		p.setRole(new Driver());
		p.doIt();
		p.setRole(new Worker());
		p.doIt();
		
	}
}
