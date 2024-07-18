package inter;

public class ImplementationC implements InterC{

	@Override
	public void metA() {
		System.out.println("ImplementC-metA() 실행");
	}

	@Override
	public void metB() {
		System.out.println("ImplementC-metB() 실행");
		
	}

	@Override
	public void metC() {
		System.out.println("ImplementC-metC() 실행");
	}

}
