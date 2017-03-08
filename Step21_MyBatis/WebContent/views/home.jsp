<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>views/home.jsp</title>
</head>
<body>
<%
	// request 에 담긴 모델을 읽어온다. 
	List<String> list=(List<String>)request.getAttribute("list");
%>
<h3>인덱스 페이지 입니다.</h3>
<ul>
	<li><a href="member/list.do">회원목록 보기</a></li>
</ul>
<h3>공지사항 입니다.</h3>
<ol>
<%for(String tmp:list){ %>
	<li><%=tmp %></li>
<%} %>
</ol>
</body>
</html>





















