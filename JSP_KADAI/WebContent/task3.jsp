<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% int i;
	if(session.getAttribute("count") !=null){
		i=((Integer)session.getAttribute("count")).intValue();
	}else{
		i = 0;
	}
	 i++;	//ここまで訪問回数のカウント
	%>
	<h1>
		訪問回数:<%=i %></h1>
	<%session.setAttribute("count", new Integer(i)); %>
	<%SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日"); %>
	<%--フォーマット生成 --%>
	<%Date d = new Date(); %>
	<%-- 現在日時の取得 --%>
	<%Calendar cl = Calendar.getInstance(); %>
	<%-- --%>
	<% out.println("今日の日付" + sdf.format(cl.getTime()));%>

</body>
</html>