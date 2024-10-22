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
		return true; //text창에 입력이 안됨. true입력 됨.
	}

</script>
</head>
<body><!-- returnEx.jsp -->
	<input type="text" onkeydown="return check()">
	

</body>
</html>