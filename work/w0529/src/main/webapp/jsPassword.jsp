<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
 	function check()
 	{
 		var pwd=document.moomin.pwd.value;
 		var pwd2=document.moomin.pwd2.value;
 		if(pwd!=pwd2)
 		{
 			alert("비밀번호가 일치하지 않습니다")
 			return false;
 		}
 		else
 		{
 			return true;
 		}
 	}

</script>
</head>
<body><!-- jsPassword.jsp -->
<!-- 비밀번호는 무조건 2개를 입력한다. -->
	<form name="moomin" method="post" action="ok.jsp" onsubmit="return check()">
	비밀번호 : <input type="password" name="pwd"><p>
	비밀번호 확인 : <input type="password" name="pwd2"><p>
	<input type="submit" value="가입"><p>
	
	</form>

</body>
</html>