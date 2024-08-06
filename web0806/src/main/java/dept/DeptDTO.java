package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
}
