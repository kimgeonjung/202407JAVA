<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 데이터베이스 접속
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");

// 임시 저장 변수
String sqlTmp = "";
String idTmp = "";
String nameTmp = "";
String ssnTmp = "";
String telTmp = "";
String balanceTmp = "";

// 매개 변수
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");
String name = request.getParameter("name");
String ssn = request.getParameter("ssn");
String tel = request.getParameter("tel");
String balance = request.getParameter("balance");
String find = request.getParameter("find");
String delete = request.getParameter("delete");

if(id != null){
	sqlTmp = "select count(*) from account where id = ?";	// 이미 있는 학번 조회 (있으면 1을 가져옴)
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, id);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	int cnt = rs.getInt(1); // 0: insert, 1: update
	
	if(cnt == 1){	// 정보 수정
		sqlTmp = "update account set name = ?, ssn = ?, tel = ?, balance = ? where id = ?";
		pstmt = conn.prepareStatement(sqlTmp);
		pstmt.setString(1, name);
		pstmt.setString(2, ssn);
		pstmt.setString(3, tel);
		pstmt.setString(4, balance);
		pstmt.setString(5, id);
		int ret = pstmt.executeUpdate();
		
	} else {	// 정보 입력
		sqlTmp = "insert into account(id, name, ssn, tel, balance) values (?,?,?,?,?)";
		pstmt = conn.prepareStatement(sqlTmp);
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, ssn);
		pstmt.setString(4, tel);
		pstmt.setString(5, balance);
		int ret = pstmt.executeUpdate();
	}
}


// 선택 조회
if (find != null) {
	sqlTmp = "select * from account where id = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, find);
	ResultSet rs = pstmt.executeQuery();
	if (rs.next()) {
		idTmp = rs.getString("id");
		nameTmp = rs.getString("name");
		ssnTmp = rs.getString("ssn");
		telTmp = rs.getString("tel");
		balanceTmp = rs.getString("balance");
	}
}

// 삭제 버튼을 통해 delete
if (delete != null) {
	sqlTmp = "delete from account where id = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, delete);
	int ret = pstmt.executeUpdate();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account 테이블</title>
<style>
table {
	width: 800px;
	text-align: center;
}

th {
	width: 40px;
	background-color: cyan;
}
</style>
</head>
<body>
	<form>
		<input type="text" name="id" value="<%=idTmp %>" placeholder="ID"><br>
		<input type="text" name="name" value="<%=nameTmp %>" placeholder="이름"><br>
		<input type="text" name="ssn" value="<%=ssnTmp %>" placeholder="생년월일"><br>
		<input type="text" name="tel" value="<%=telTmp %>" placeholder="전화번호"><br>
		<input type="text" name="balance" value="<%=balanceTmp %>" placeholder="잔고"><br>
		<input type="submit" value="입력/수정">
	</form>
	<table>
		<tr><th colspan="6">ACCOUNT 테이블</th></tr>
		<tr>
			<th>ID</th>
			<th>이름</th>
			<th>생년월일</th>
			<th>전화번호</th>
			<th>잔고</th>
			<th>삭제</th>
		</tr>
		<%
sqlTmp = "select * from account";
pstmt = conn.prepareStatement(sqlTmp);
ResultSet rs = pstmt.executeQuery();

while(rs.next()) {
	idTmp = rs.getString("id");
	nameTmp = rs.getString("name");
	ssnTmp = rs.getString("ssn");
	telTmp = rs.getString("tel");
	balanceTmp = rs.getString("balance");
%>
	<tr>
		<td><a href="?find=<%=idTmp%>"><%=idTmp %></a></td>
		<td><%=nameTmp %></td>
		<td><%=ssnTmp %></td>
		<td><%=telTmp %></td>
		<td><%=balanceTmp %></td>
		<td><button onclick="location.href='?delete=<%=idTmp %>'">삭제</button></td>
	</tr>
<%	
}
%>
	</table>
</body>
</html>