<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function useridChk(my) {
	var chk=new XMLHttpRequest();
	chk.onload=function() {
		var isUserid=chk.responseText;
		var text=document.getElementById("chk");
		
		if(isUserid==1) {
			text.innerText="중복된 아이디입니다";
			text.style.color="red";
		} else {
			text.innerText="";
		}
	}
	chk.open("get","useridChk?userid="+my.value);
	chk.send();
}
</script>
<style>
	section {
		width:400px;
		margin:50px auto;
		
	}
	
	form input {width:100%; height: 30px; margin:5px;}
</style>
</head>
<body>
	<section>
		<form method="post" action="memberOk">
			<div><input type="text" name="userid" placeholder="아이디" oninput="useridChk(this)"></div>
			<div id="chk"></div>
			<div><input type="text" name="name" placeholder="이름"></div>
			<div><input type="password" name="pwd" placeholder="비밀번호"></div>
			<div><input type="password" id="pwd2" placeholder="비밀번호 확인"></div>
			<div><input type="submit" value="회원가입"></div>
		</form>
	</section>
</body>
</html>