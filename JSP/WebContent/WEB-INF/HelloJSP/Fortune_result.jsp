<%@page import="jsp.task4"%>
<%@page import="jsp.FortuneBean"%>		<!--//(パッケージ名,クラス名)-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<% FortuneBean fb = (FortuneBean)request.getAttribute("fortuneData"); %>
	<!-- fortuneDateをgetAttribute、データ名には""をつける-->
<meta charset="UTF-8">
<title>Fortune_Result</title>
</head>
<body>
<!--日付取ってくる処理の場所を見直す→課題の指示通りtask4で取得するようにする-->
<% out.println("↓" + fb.getToday() + "↓"); %>
<h1><% out.println(fb.getFortune()); %></h1>
</body>
</html>