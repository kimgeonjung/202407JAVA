package role;

public class Worker implements Role{

	@Override
	public void doIt() {
		System.out.println("종업원");
	}
	
}
