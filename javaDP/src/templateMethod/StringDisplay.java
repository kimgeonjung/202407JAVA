package templateMethod;

public class StringDisplay extends AbstractDisplay {
	private String string;
	private int width;

	public StringDisplay(String string) {
		this.string = string;
		this.width = string.length();
	}

	// open과 close에서 호출되어 +----+ 표시
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		printLine();
	}

}
