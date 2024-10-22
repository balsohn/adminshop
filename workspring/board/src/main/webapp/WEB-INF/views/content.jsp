<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	section {width: 500px; margin:auto;}
	.first {display:grid; grid-template-columns:0.5fr 1.2fr 0.5fr 1.2fr; margin:20px 0;}
</style>
</head>
<body>
	<section>
		<h2>${bdto.title}</h2>
		<div class="first">
			<div>작성자</div><div>${bdto.name}</div>
			<div>작성일</div><div>${bdto.writeday}</div>
			<div>글번호</div><div>${bdto.id}</div>
			<div>조회수</div><div>${bdto.readnum}</div>		
		</div>
		<div>내용</div>
		<div>${bdto.content}</div>
		<div class="btn">
			<a href="update?id=${bdto.id}">수정</a>
			<a href="delete?id=${bdto.id}">삭제</a>
		</div>
	</section>
</body>
</html>