<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function isEqual()
	{
		var pwd=document.moomin.pwd.value;
		var pwd2=document.moomin.pwd2.value;
		
		if(pwd2.length>=1)
		{
		if(pwd == pwd2)
		{
			document.getElementById("aa").innerText="비밀번호가 일치합니다."
			document.getElementById("aa").style.color="green";
		}
		else
		{
			document.getElementById("aa").innerText="비밀번호가 일치 하지 않습니다."
			document.getElementById("aa").style.color="red";
		}
		}
	}
	
</script>
</head>
<body>
	<form name="moomin" method="post" action="ok.jsp" >
	비밀번호 : <input type="password" name="pwd"><p>
	비밀번호 확인 : <input type="password" name="pwd2" onkeyup="isEqual()"><p>
	<div id="aa"></div>
	<input type="submit" value="가입"><p>
	
	</form>
</body>
</html>