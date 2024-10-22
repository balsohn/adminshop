<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
	$(function()
	{
		$("#btn").click(function()
		{
		// 아이디의 길이가 5글자 이상, 비밀번호는 4자이상
		// 길이가 안되면 경고창 메시지
		// 둘자 정상적이면 "ok"메세지
		var userid=$("#userid").val();
		var pwd=$("#pwd").val();
		
		if(userid.length<5 && pwd.length<4)
		{
			alert("경고");
		}
		else
		{
			alert("ok");
		}
		})
	})
</script>
</head>
<body>
	<form name="pkc">
		아이디 <input type="text" name="userid" id="userid"> <p>
		비밀번호 <input type="password" name="pwd" id="pwd"> <p>
		<input type="button" value="확인" id="btn">
	</form>
</body>
</html>