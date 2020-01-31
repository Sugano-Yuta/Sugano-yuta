<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TASK</title>
</head>
<body>
	<%!int numA = 125;%>
	<%!int numB = 110;%>
	<h1>
		125-110=<%
		out.print(numC);
	%>
	</h1>
	<%!int numC = numA - numB;%>
	<%!int numD = 17;%>
	<%!int numE = 21;%>
	<h1>
		17-21=<%
		out.print(numF);
	%>
	</h1>
	<%!int numF = numD - numE;%>

	<%!public int substraction(int numA, int numB) {
		int numC = numA - numB;
		return numC;
	}%>
	<%!public int substractiononemore(int numD, int numE) {
		int numF = numD - numE;
		return numF;
	}%>
	<%!public void main(String[] args) {
		substraction(numA, numB);
		substractiononemore(numD, numE);
	}%>
</body>
</html>