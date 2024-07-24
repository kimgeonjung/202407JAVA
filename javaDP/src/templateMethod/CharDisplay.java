package templateMethod;

public class CharDisplay extends AbstractDisplay{
	private char ch;
	
	//생성자
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		// 시작 문자열 << 표시
		System.out.print("<<");
	}

	@Override
	public void print() {
		// 필드에 기억해둔 문자를 1회 표시
		System.out.print(ch);
	}

	@Override
	public void close() {
		// 종료 문자열 >> 표시
		System.out.println(">>");
	}
}
