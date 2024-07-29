package java0729;

public class Ex3 {
	public static void main(String[] args) {
		String str = "변경할 문자열 비교 1234";
		String newStr = str.replace("1234", "5678");
		str = str.replace("1234", "5678");
		System.out.println(str);
		System.out.println(newStr);
		
		if(str == newStr) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		if(str.equals(newStr)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
}
