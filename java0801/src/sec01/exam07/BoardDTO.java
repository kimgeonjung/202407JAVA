package sec01.exam07;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class BoardDTO {
	private int num;
	private String writer;
	private String title;
	private String content;
	private String regtime;
	private int hits;
}
