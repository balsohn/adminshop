<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	var chk1=0;
	var chk2=0;

	function useridChk(userid) {
		var chk=new XMLHttpRequest();
		chk.onload=function() {
			var result=chk.responseText;
			if(result==1) {
				document.getElementById("useridChk").innerText="중복된 아이디입니다.";
				document.getElementById("useridChk").style.color="red";
				chk1=0;
			} else {
				document.getElementById("useridChk").innerText="";
				document.getElementById("useridChk").style.color="red";
				chk1=1;
			}
		}
		chk.open("get","useridChk?userid="+userid);
		chk.send();
	}
	
	function pwdChk(pwd) {
		var pwd1=document.getElementById("pwd1");
		var pwd2=document.getElementById("pwd2");
		var pwd1Chk=document.getElementById("pwd1Chk");
		var pwd2Chk=document.getElementById("pwd2Chk");
		
		if(pwd2.value) {
			if(pwd1.value!=pwd2.value) {
				pwd2Chk.innerText="비밀번호가 일치하지 않습니다.";
				pwd2Chk.style.color="red";
				chk2=0;
			} else {
				pwd2Chk.innerText="";
				chk2=1;
			}
		} else {
			pwd2Chk.innerText="";
			chk2=0;
		}
	}
	
	function chk() {
		if(chk1==1 && chk2==1) {
			return true;
		} else {
			alert("정보를 확인하세요.");
			return false;
		}
	}
</script>
</head>
<body>
	<form method="post" action="memberOk" onsubmit="return chk()">
		<div><input type="text" id="userid" onkeyup="useridChk(this.value)" name="userid" placeholder="아이디"></div>
		<div id="useridChk"></div>
		<div><input type="text" name="name" placeholder="이름"></div>
		<div><input type="password" onkeyup="pwdChk()" id="pwd1" name="pwd" placeholder="비밀번호"></div>
		<div id="pwd1Chk"></div>
		<div><input type="password" onkeyup="pwdChk()" id="pwd2" placeholder="비밀번호 확인"></div>
		<div id="pwd2Chk"></div>
		<div><input type="submit" value="회원가입"></div>
	</form>
</body>
</html>