package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class DeptDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// sql
	private String DEPT_LIST = "select * from dept";
	private String DEPT_INSERT = "insert into dept values (?, ? ,?)";
	private String DEPT_UPDATE = "update dept set dname = ?, loc = ? where deptno = ?";
	
	// 기능 
	
	// 테이블 목록 출력
	public List<DeptDTO> getDeptList(){
		List<DeptDTO> list = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(DEPT_LIST);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DeptDTO dto = new DeptDTO(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3));
				list.add(dto);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeResources(conn, pstmt, rs);
		}
		return list;
	}
	
	// insert
	public void insertDept(DeptDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(DEPT_INSERT);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeResources(conn, pstmt);
		}
	}
	
	// update
	public void updateDept(DeptDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(DEPT_UPDATE);
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, dto.getDeptno());
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeResources(conn, pstmt);
		}
	}
}
