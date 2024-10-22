<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function getMember() {
			var chk=new XMLHttpRequest();
			chk.onload=function() {
				
				var data=JSON.parse(chk.responseText);
				document.getElementById("userid").innerText=data.userid;
				document.getElementById("name").innerText=data.name;
				document.getElementById("phone").innerText=data.phone;
			}
			chk.open("get","getMember?id=5");
			chk.send();
			
		}
	</script>
</head>
<body> <!-- json2.jsp -->
	<input type="button" onclick="getMember()" value="회원정보">
	<hr>
	아이디 : <span id="userid"></span> <p>
	이름 : <span id="name"></span> <p>
	전화번호 : <span id="phone"></span> <p>
	
</body>
</html>