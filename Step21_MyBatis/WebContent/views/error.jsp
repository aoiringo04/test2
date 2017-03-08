<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>views/error.jsp</title>
</head>
<body>
<%
	//request 에 담긴 에러 메세지를 읽어온다.
	String msg=(String)request.getAttribute("msg");
%>
<h3>Oops! <%=msg %></h3>
<a href="<%=request.getContextPath()%>">인덱스로 가기</a>
</body>
</html>










