<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#form {visibility: hidden;}
</style>
<script>
	function chk(n) {
		// type 요소를 선택하여 value를 설정합니다.
		document.getElementById("type").value = n;
		document.getElementById("form").style.visibility="visible";
		if(n == 1) {
			document.getElementById("submit").value = "수정";
		} else if(n == 2) {
			document.getElementById("submit").value = "삭제";
		}
	}
	
	function cancel() {
		document.getElementById("form").style.visibility="hidden";
	}
</script>
</head>
<body>
	<table>
		<h2>${bdto.title}</h2>
		<tr>
			<td>작성자</td>
			<td>${bdto.name}</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${bdto.readnum }</td>
		</tr>
		<tr>
			<td>작성일</td>
			<td>${bdto.writeday }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${bdto.content }</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="button" onclick="chk(1)">수정</button>
				<button type="button" onclick="chk(2)">삭제</button>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<form method="post" id="form" action="isPwd">
				<!-- hidden input에 id를 설정해주고 script에서 해당 id를 사용 -->
				<input type="hidden" id="type" name="type" value="">
				<input type="hidden" id="id" name="id" value="${bdto.id}">
				<input type="password" name="pwd">
				<input type="submit" value="삭제" id="submit">
				<button onclick="cancle()">취소</button>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>
