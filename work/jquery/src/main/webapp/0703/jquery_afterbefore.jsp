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
		$("#aa").before("나는 매운 ");
		$("#aa").after(" 좋아요!!");
	})
</script>
</head>
<body> <!-- jquery_afterbefore.jps -->
	<span id="aa"> 갈비찜 </span>

</body>
</html>