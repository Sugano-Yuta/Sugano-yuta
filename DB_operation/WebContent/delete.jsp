<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body>
	<form action="/operation/DeleteEmployee" method="post">
		削除するID<br> <input type="text" name="id"><br> <input
			type="submit" value="送信">
	</form>
</body>
</html>