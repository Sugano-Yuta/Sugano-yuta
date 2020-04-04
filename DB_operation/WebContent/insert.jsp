<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert</title>
</head>
<body>
	<form action="/DB_operation/register" method="post">
		ID<br>
		<input type="text" name="id"><br> 名前<br>
		<input type="text" name="name"><br> 誕生日<br>
		<input type="text" name="birthday"><br> 年齢<br>
		<input type="text" name="age"><br> <input type="submit"
			value="送信">
	</form>

</body>
</html>