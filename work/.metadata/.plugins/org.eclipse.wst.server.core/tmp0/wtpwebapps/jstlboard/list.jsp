<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="jstlboard.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Board board=new Board();
	board.list(request);
%>
<script>
	function change(n)
	{
		location="list.jsp?pageSize="+n;
	}
</script>
<table>
	<c:if test="${pageSize!=null}"> <c:set var="a" value="&pageSize=${pageSize}"/></c:if>
	<caption><h2>게시판</h2></caption>
	<tr>
		<td colspan="4" align="right">
			<select name="pageSize" id="pageSize" onchange="change(this.value)">
			<c:forEach var="i" begin="10" end="50" step="10">
				<option value="${i}" <c:if test="${i == pageSize}">selected</c:if>>${i}</option>
			</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<th>작성자</th>
		<th>제목</th>
		<th>조회수</th>
		<th>작성일</th>
	</tr>
	
	<!-- 게시물 출력 -->
	<c:forEach var="row" items="${list}">
	<tr>
		<td> ${row.name}</td>
		<td> <a href="readnum.jsp?id=${row.id}&page=${page}">${row.title}</a></td>
		<td> ${row.readnum}</td>
		<td> ${row.writeday}</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="4" align="right"><a href="write.jsp"> 글 쓰기</a></td>
	</tr>
	<!-- 페이지네이션 -->
	<tr><td colspan="4" align="center">
	<c:if test="${pstart>1}">
		<a href="list.jsp?page=1${a}">처음으로</a>
		<a href="list.jsp?page=${pstart-1}${a}">이전</a>
	</c:if>
	<c:forEach var="i" begin="${pstart}" end="${pend}">
		<a href="list.jsp?page=${i}${a}" <c:if test="${page==i}">style="color:red"</c:if>style="color:black" >${i} </a>
	</c:forEach>
	<c:if test="${pend<chong}">
		<a href="list.jsp?page=${pend+1}${a}">다음</a>
		<a href="list.jsp?page=${chong}${a}">마지막</a>
	</c:if>
	</td></tr>
</table>
</body>
</html>
<%
	board.close();
%>