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
		$("#form").submit(function()
		{
			var userid=$("#userid").val();
			var pwd=$("#pwd").val();
			if(userid.length<5)
			{
				alert("아이디는 5자 이상입니다.");
				return false;
			}
			else if(pwd.length<4)
			{
				alert("비밀번호는 4자 이상입니다.");
				return false;
			}
			else
			{
				return true;
			}
		})
	})
</script>
</head>
<body>
	<form name="pkc" method="post" action="ok.jsp" id="form">
		아이디 <input type="text" name="userid" id="userid"> <p>
		비밀번호 <input type="password" name="pwd" id="pwd"> <p>
		<input type="submit" value="확인" id="btn">
	</form>
</body>
</html>