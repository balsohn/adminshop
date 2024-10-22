<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="writeOk.jsp" enctype="multipart/form-data">
	<table id="container">
		<caption><h2>게시글 작성</h2></caption>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" id="title"></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pwd" id="pwd"></td>
		</tr>
		<tr>
			<td>게시판종류</td>
			<td>
				<select name="type" id="type">
					<option value="자유게시판">자유게시판</option>
					<option value="Q&A">Q&A</option>
					<option value="공지사항">공지사항</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content" id="content"></textarea>
		</tr>
		<tr>
			<td>파일 업로드</td>
			<td><input type="file" name="fname" id="fname"></td>
		</tr>
		<tr>	
			<td>
				<input type="submit" value="글 쓰기" id="submit">
				<a href="list.jsp">목록가기</a>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>