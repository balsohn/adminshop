<%@page import="practice.Board"%>
<%@page import="practice.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	Board bd=new Board();
	bd.content(request);
%>
</head>
<body>
	<div> 제목 ${bdto.title }</div>
	<div> 작성자 ${bdto.name }</div>
	<div> 항목 ${bdto.type }</div>
	<div> 내용 ${bdto.content }</div>
	<hr>
	<div>
		<a href="update.jsp?id=${bdto.id}"> 수정 </a>
		<a href="delete.jsp?id=${bdto.id}"> 삭제 </a>
		<a href="list.jsp"> 목록 </a>
	</div>
	
</body>
</html>