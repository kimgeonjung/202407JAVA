package inter;

public class InterEx {
	public static void main(String[] args) {
		ImplementationC im = new ImplementationC();
		
		InterA ia = im;
		ia.metA();
		System.out.println();
		
		InterB ib = im;
		ib.metB();
		System.out.println();
		
		InterC ic = im;
		ic.metA();
		ic.metB();
		ic.metC();
	}
}
