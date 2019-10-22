<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="model.bean.Aluno" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample JSP</title>
</head>
<body>
	<%
		String aluno = (String) request.getAttribute("alunos");
		out.print("<br>Try: " + aluno);
	%>
</body>
</html>