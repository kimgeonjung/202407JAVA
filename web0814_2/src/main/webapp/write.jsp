<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<style>
	th{
		text-align: center;
	}
	</style>
</head>
<body>
<div class="container">
<form method="post" action="${action}">
    <table class="table table-bordered">
        <tr>
            <th>제목</th>
            <td><input class="form-control" type="text" name="title"  maxlength="80"
                       value="${msg.title}">
            </td>
        </tr>
        <tr>
            <th>작성자</th>
            <td><input class="form-control" type="text" name="writer" maxlength="20"
                       value="${msg.writer}">
            </td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea class="form-control" name="content" rows="10">${msg.content}</textarea>
            </td>
        </tr>
    </table>

    <br>
    <button type="submit" class="btn btn-outline-secondary">저장</button>
    <button type="button" class="btn btn-outline-secondary" onclick="history.back()">취소</button>
</form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>