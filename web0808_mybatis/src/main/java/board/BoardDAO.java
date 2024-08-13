package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private String BOARD_LIST = "select * from board";
	private String BOARD_INSERT = "insert into board(writer, title, content, regtime, hits) values (?,?,?,now(),0)";
	private String BOARD_GET_ONE = "select * from board where num = ?";
	private String BOARD_UPDATE = "update board set writer = ?, title = ?, content = ?, regtime = now() where num = ?";
	private String BOARD_DELETE = "delete from board where num = ?";
	private String BOARD_HITS = "update board set hits = hits + 1 where num = ?";

	// 게시판 등록
	public void insertBoard(BoardDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_INSERT);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeResources(conn, pstmt);
		}
	}
	
	// 게시글 수정
	public void updateBoard(BoardDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_UPDATE);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, dto.getNum());
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeResources(conn, pstmt);
		}
	}
	
	// 게시판 목록 조회
	public List<BoardDTO> getBoardList() {
		List<BoardDTO> list = new ArrayList<>();
		
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_LIST);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO(
						rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4),
						rs.getString(5), 
						rs.getInt(6));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeResources(conn, pstmt, rs);
		}
		return list;
	}

	// 게시글 한 건 조회
	public BoardDTO getOne(int num) {
		BoardDTO dto = null;
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_GET_ONE);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new BoardDTO(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeResources(conn, pstmt, rs);
		}
		return dto;
	}

	// 게시글 삭제
	public void deleteBoard(int num) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_DELETE);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.closeResources(conn, pstmt);
		}
	}
	
	// 조회수 증가
	public void increaseHits(int num) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(BOARD_HITS);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeResources(conn, pstmt);
		}
	}
	
}
