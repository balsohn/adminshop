<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function idchk(n) {
		
		var chk=new XMLHttpRequest();
		chk.onload=function() {
				
		}		
		chk.open("get","useridChk?userid="+n);
		chk.send();
		
	}
</script>
<style>
	section {width:400px; text-align: center; margin:auto;}
	section > form > div > div > input {width:100%; height:30px; margin:5px auto; border-radius: 3px;}
	section > form > div > input {border:none; width:100px; margin:10px auto; height:30px; background: black; color:white;}
</style>
</head>
<body>
	<section>
		<form method="post" action="memberOk">
		<div><h2> 회원가입 </h2></div>
		<div>
			<div><input type="text" name="userid" oninput="idchk(this.value)" placeholder="아이디"></div>
			<div id="useridchk"></div>
			<div><input type="text" name="name" placeholder="이름"></div>
			<div><input type="password" name="pwd" placeholder="비밀번호"></div>
			<div><input type="password" name="pwd2" placeholder="비밀번호 확인"></div>
			<div><input type="text" name="email" placeholder="이메일"></div>
			<div><input type="text" name="phone" placeholder="전화번호"></div>
			<input type="submit" value="회원가입">
		</div>
		</form>
	</section>
</body>
</html>