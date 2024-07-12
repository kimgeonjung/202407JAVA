package project1;

public class Member {
	String name;
	String ssn; //주민번호 6자리
	String phone;
	int balance;
	
	
	public Member(String name, String ssn, String phone, int balance) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", ssn=" + ssn + ", phone=" + phone + ", balance=" + balance + "]";
	}



	public Member() {}
		
}
