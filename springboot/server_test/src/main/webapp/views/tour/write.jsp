<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	section {
		width:400px;
		margin:auto;
		text-align: center;
	}
	section input {
		width:100%;
		margin-top:20px;
	}
	
	section textarea {
		width:100%;
		resize:vertical;
		height: 300px;
		margin-top:10px;
	}
</style>
</head>
<body>
	<section>
		<form method="post" action="writeOk" enctype="multipart/form-data">
			<div><input type="text" name="title" placeholder="제목"></div>
			<div><textarea name="content"></textarea></div>
			<div><input type="file" name="file"></div>
			<div><input type="submit" value="글쓰기"></div>
		</form>
	</section>
</body>
</html>