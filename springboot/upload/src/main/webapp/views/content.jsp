<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#delform {visibility: hidden;}
</style>
<script>
	function viewForm(n) {
		if(n==1) {
			document.getElementById("delform").style.visibility="visible";
			document.getElementById("vform").action="delete";
			document.getElementById("submit").value="삭제";
		}
		
		if(n==2) {
			document.getElementById("delform").style.visibility="visible";
			document.getElementById("vform").action="update";
			document.getElementById("submit").value="수정";
		}
	}
</script>
</head>
<body>
	<section>
		<table>
			<h2>여행후기</h2>
			<tr>
				<td>제목</td>
				<td>${tdto.title }</td>
				<td>조회수</td>
				<td>${tdto.readnum}</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>${tdto.name }</td>
				<td>등록일</td>
				<td>${tdto.writeday}</td>
			</tr>
			<tr>
				<td>파일</td>
				<td colspan="3">
				<c:forEach var="ofname" items="${ofname}" varStatus="sts">
				<a href="down2?ofname=${ofname}&fname=${fname[sts.index]}">${ofname}</a>
				${tdto.fileLength[sts.index]}
				</c:forEach>
				</td>
			</tr>
			<tr>
				<td>내용</td>
				<td colspan="3">${tdto.content }</td>
			</tr>
			<tr>
				<td colspan="4">
					<a href="list">목록</a>
					<button onclick="viewForm(1)">삭제</button>
					<button onclick="viewForm(2)">수정</button>
				</td>
			</tr>
			<tr>
				<td colspan="4" id="delform">
					<form method="post" action="deleteOk" id="vform">
						<input type="hidden" name="id" value="${tdto.id}">
						<input type="password" name="pwd">
						<input type="submit" value="삭제" id="submit">
					</form>
				</td>
			</tr>
		</table>
	</section>
</body>
</html>