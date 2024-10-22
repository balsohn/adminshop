<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div> 제목 ${bdto.title }</div>
	<div> 작성자 ${bdto.name }</div>
	<div> 내용 ${bdto.content }</div>
	<hr>
	<div>
		<a href="Update?id=${bdto.id}"> 수정 </a>
		<a href="Delete?id=${bdto.id}"> 삭제 </a>
		<a href="List"> 목록 </a>
	</div>
	
</body>
</html>