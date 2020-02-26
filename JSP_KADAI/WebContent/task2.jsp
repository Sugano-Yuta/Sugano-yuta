<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%!
	int num (int a,int b){
		int dif = a - b;
		return dif;
	}
%>
<title>JSP TASK</title>
</head>
<body>
<h1>125-15 =<%= num(125,15) %></h1>
<h1>17-24 =<%=num(17,21) %></h1>
</body>
</html>