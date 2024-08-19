<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<style>
a {
	color: inherit;
	text-decoration: none;
}
</style>
<title>list</title>
</head>
<body>
	<div class="container">
		<table class="table table-bordered table-hover">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일시</th>
				<th>조회수</th>
			</tr>

			<c:forEach var="msg" items="${msgList}">
				<tr style="cursor: pointer;"
					onclick="location.href='view?num=${msg.num}&page=${param.page}'">
					<td>${msg.num}</td>
					<td>${msg.title}</td>
					<td>${msg.writer}</td>
					<td>${msg.regtime}</td>
					<td>${msg.hits}</td>
				</tr>
			</c:forEach>
		</table>

		<br>
		<div class="text-center">
			<c:forEach var="pgn" items="${pgnList}">
				<a class="pgn" href="list?page=${pgn.pageNo}"> 
				<c:choose>
					<c:when test="${pgn.curPage}">
						<b><u>${pgn.display}</u></b>
					</c:when>
					<c:otherwise>
                    	 ${pgn.display}
                 	</c:otherwise>
				</c:choose>
				</a>&nbsp;
    </c:forEach>
		</div>
		<button type="button" class="btn btn-outline-secondary"
			onclick="location.href='write'">글쓰기</button>
	</div>
	<br>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>