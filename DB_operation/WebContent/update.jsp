<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新</title>
</head>
<body>
<form action = "/operation/UpdateEmployee" method = "post">
更新するID<br><input type = "text" name = "id"><br>
更新後の名前<br><input type = "text" name = "name"><br>
<input type="submit" value="更新">
</form>

</body>
</html>