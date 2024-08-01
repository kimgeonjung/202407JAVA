package account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AccountDTO {
	private int id;
	private String name;
	private String ssn;
	private String tel;
	private int balance;
}
