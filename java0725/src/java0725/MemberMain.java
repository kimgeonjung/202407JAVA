package java0725;

class Member2{
	String id;

	public Member2(String id) {
		super();
		this.id = id;
	}
}

public class MemberMain {
	public static void main(String[] args) {
		String str1 = new String("blue");
		String str2 = new String("blue");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		if(str1.equals(str2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		} // String은 API라서 equals에 대한 처리가 되어있어서 같게 나옴
		
		Member member1 = new Member("blue");
		Member2 member2 = new Member2("blue");
		
		if(member1.equals(member2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		} // 
	}
}
