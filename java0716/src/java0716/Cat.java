package java0716;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Cat {
	private String breed; // 품종
	private String color;
	private int age;

	Cat(){
		System.out.println("Cat()");
	}
	Cat(int age){
		
	}
}
