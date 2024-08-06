package drive;

import dept.DeptDAO;
import dept.DeptDTO;

public class TestMain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		int deptno = dao.searchDeptno("SALES");
		System.out.println(deptno);
	}
}
