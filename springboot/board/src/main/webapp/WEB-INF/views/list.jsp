<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	section {width:800px; margin: auto;}
	.header {text-align: right;}
	table {width:100%;}
</style>
<script>
	function chg(n){
		location="list?pageSize="+n;
		
	}
	
	window.onload=function() {
		document.getElementById("pageSize").value=${pageSize};
	}
</script>
</head>
<body>
	<section>
		<div class="header">
			<a href="member">회원가입</a>
			<a href="login">로그인</a>
		</div>
		<table>
		<h2>게시판</h2>
			<tr>
				<td colspan="4" align="right">
					<select id="pageSize" name="pageSize"onchange="chg(this.value)">
						<option value="10">10</option>
						<option value="20">20</option>
						<option value="30">30</option>
						<option value="50">50</option>
						<option value="70">70</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>제 목</td>
				<td>작성자</td>
				<td>조회수</td>
				<td>작성일</td>
			</tr>
			<c:forEach var="list" items="${blist}">
			<tr>
				<td><a href="readnum?id=${list.id}">${list.title }</a></td>
				<td>${list.name }</td>
				<td>${list.readnum }</td>
				<td>${list.writeday }</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan="4" align="right"><a href="write">글쓰기</a></td>
			</tr> 
			<tr>
				<td colspan="4" align="center">
					<c:if test="${pstart!=1}">
					<a href="list?page=1&pageSize=${pageSize}&stype=${stype}&sword=${sword}">처음</a>
					<a href="list?page=${pstart-1}&pageSize=${pageSize}&stype=${stype}&sword=${sword}">이전</a>
					</c:if>
					<c:forEach var="i" begin="${pstart}" end="${pend}">
					<a href="list?page=${i}&pageSize=${pageSize}&stype=${stype}&sword=${sword}">${i}</a>
					</c:forEach>
					<c:if test="${pend!=chong}">
					<a href="list?page=${pend+1 }&pageSize=${pageSize}&stype=${stype}&sword=${sword}">다음</a>
					<a href="list?page=${chong }&pageSize=${pageSize}&stype=${stype}&sword=${sword}">마지막</a>
					</c:if>
				</td>
			</tr>
			<tr>
				<td colspan="4" align="center">
				<form method="get" action="list">
				<select name="stype">
					<option value="name">작성자</option>
					<option value="title">제목</option>
					<option value="content">내용</option>
				</select>
				<input type="text" name="sword">
				<input type="submit" value="검색">
				</form>
				</td>
			</tr>
		</table>
	</section>

	
</body>
</html>