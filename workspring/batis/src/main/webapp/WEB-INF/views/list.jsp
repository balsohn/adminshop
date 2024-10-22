<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function chg(){
		location.href="list?pageSize="+document.getElementById("pageSize").value;
	}
	
	window.onload=function() {
		document.getElementById("pageSize").value=${pageSize};
	}
</script>
</head>
<body>
	<table>
		<tr>
			<td colspan="5" align="right">
				<select name="pageSize" id="pageSize" onchange="chg()">
					<option value="10">10</option>
					<option value="20">20</option>
					<option value="30">30</option>
					<option value="50">50</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>조회수</td>
			<td>작성자</td>
			<td>작성일</td>
		</tr>
		<c:forEach var="list" items="${list}">
		<tr>
			<td>${list.id}</td>
			<td><a href="readnum?id=${list.id}&page=${page}&pageSize=${pageSize}">${list.title }</a></td>
			<td>${list.readnum }</td>
			<td>${list.name }</td>
			<td>${list.writeday }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5" align="center">
				<c:if test="${pstart!=1}">
				<a href="list?page=1&pageSize=${pageSize}">처음 </a>
				<a href="list?page=${pstart-1}&pageSize=${pageSize}"> 이전</a>
				</c:if>
				<c:forEach var="i" begin="${pstart}" end="${pend}">
				<a href="list?page=${i}&pageSize=${pageSize}">${i}</a>
				</c:forEach>
				<c:if test="${pend!=chong}">
				<a href="list?page=${pend+1}&pageSize=${pageSize}">다음  </a>
				<a href="list?page=${chong}&pageSize=${pageSize}">마지막 </a>
				</c:if>
			</td>
		</tr>
	</table>
</body>
</html>