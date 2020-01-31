<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>task3</title>
<%! int count = 0;
	int num = 0;
	public static int add(int count, int num){
		count ++;
		return count + 1;}%>
</head>
<body>
	<%@ page import="java.text.SimpleDateFormat"%>
	<%@ page import="java.util.Calendar;"%>

	<%
		
	%>
	<%
		count++;
	%>
	<h1>
		<%
			out.println("訪問回数:" + count);
		%>
	</h1>
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
	%>
	<%
		Calendar cl = Calendar.getInstance();
	%>
	<%
		sdf.applyPattern("yyyy年MM月dd日");
	%>
	<P>
		<%
			out.println(sdf.format(cl.getTime()));
		%>
	</P>
</body>
</html>