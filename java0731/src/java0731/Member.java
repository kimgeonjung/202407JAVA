package java0731;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Member {
	public static int MALE = 0;
	public static int FEMALE =1;
	
	private String name;
	private int sex;
	private int age;
	
}
