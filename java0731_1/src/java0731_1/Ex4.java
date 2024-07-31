package java0731_1;

public class Ex4 {
	public static void main(String[] args) {
		char grade = 'B';
		int score = switch(grade) {
		case 'A', 'a' -> {yield 100;}
		case 'B', 'b' -> {yield 80;}
		default -> {yield 70;}
		};
		System.out.println(score);
	}
}
