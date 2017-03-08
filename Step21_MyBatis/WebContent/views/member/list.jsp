<%@page import="test.member.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	// request 에 "list" 라는 키값으로 담긴 회원목록을 얻어온다. 
	List<MemberDto> list=
		(List<MemberDto>)request.getAttribute("list");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>views/member/list.jsp</title>
</head>
<body>
<a href="insertform.do">회원정보 추가</a>
<h3>회원 목록입니다.</h3>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>주소</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
	</thead>
	<tbody>
	<%for(MemberDto tmp:list) {%>
		<tr>
			<td><%=tmp.getNum() %></td>
			<td><%=tmp.getName() %></td>
			<td><%=tmp.getAddr() %></td>
			<td><a href="updateform.do?num=<%=tmp.getNum()%>">수정</a></td>
			<td><a href="delete.do?num=<%=tmp.getNum()%>">삭제</a></td>
		</tr>
	<%} %>
	</tbody>
</table>
</body>
</html>







