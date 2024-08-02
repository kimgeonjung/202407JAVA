package member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
}
