<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		section {width: 500px; margin:auto;}
		.first input {width: 80%; height:25px;}
		.first {display:grid; grid-template-columns:0.5fr 1.2fr 0.5fr 1.2fr; margin:20px 0;}
		.second input {width:100%;height:25px; margin:10px 0;}
		.second textarea {width:100%; resize:vertical; height:500px;}
		.btn {text-align: right; margin: 20px;}
		.btn input[type=submit] {border:none; width:100px; height:30px; background:black; color:white; cursor: pointer;}
	</style>
</head>
<body>
	<section>
		<form method="post" action="updateOk">
		<input type="hidden" name="id" value="${bdto.id}">
		<div class="first">
			<div>작성자</div><div><input type="text" name="name" value="${bdto.name}"></div>
			<div>비밀번호</div><div><input type="password" name="pwd"></div>
		</div>
		<div class="second">
			<div>제목</div><div><input type="text" name="title" value="${bdto.title}"></div>
			<div>내용</div><div><textarea name="content">${bdto.content}</textarea></div>
		</div>
		<div class="btn">
			<input type="submit" value="수정">
		</div>
		</form>
	</section>
</body>
</html>