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
 		//textarea에서는 글의 길이를 제한
 		var sogae=document.pkc.sogae.value;
 		
 		if(sogae.length >100)
 		{
 			alert("100자 이내");
 			return false;
 		}
 		else
 		{
 			return true;
 		}
 	}
 	
 	function isLength()
 	{
 		var sogae=document.pkc.sogae.value;
 		
 		var len=sogae.length;
 		
 		document.getElementById("aa").innerText=len;
 	}
 
 	//키를 입력할때 마다 입력된 글의 길이를 출력하기 
 </script>


</head>
<body><!-- jsTextarea.jsp -->

<form name="pkc" method="post" action="ok.jsp" onsubmit="return check()">
	소개 : <textarea cols="30" rows="5" name="sogae" maxlength="100" onkeyup="isLength()"></textarea>
	<span id="aa">0</span>/100 <p>
	<input type="submit" value="전송">
</form>

</body>
</html>