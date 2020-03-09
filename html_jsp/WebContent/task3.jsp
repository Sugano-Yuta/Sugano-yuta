<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP KADAI</title>
<%!int count = 1;%>
<%!Calendar Cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
	String str = sdf.format(Cal.getTime());%>
</head>
<body>
	<h1>
		<%
			out.println("訪問回数:" + count++);
		%>
	</h1>
	<p>
		<%
			out.println("今日の日付:"  + str);
		%>

	</p>

</body>
</html>