<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

	function chg()
	{	
	document.getElementById("aa").style.color="red";
	}
	//chg(); Script태그내에서 함수를 호출하면 아래내용은 읽지 않은상태 
	
</script>

</head>

<body onload="chg()"> <!-- jsStart111.jsp -->

<div id="aa"> 하하하 </div>


</body>
</html>