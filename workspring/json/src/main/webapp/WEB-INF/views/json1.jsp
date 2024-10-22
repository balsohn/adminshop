<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function getValue() {
			var chk=new XMLHttpRequest();
			chk.onload=function() {
				var data=JSON.parse(chk.responseText);
			//	data={name:"superman",age:"33"};
				document.getElementById("name").innerText=data.name;
				document.getElementById("age").innerText=data.age;
				document.getElementById("phone").innerText=data.phone;
				
			}
			chk.open("get","getValue");
			chk.send();
		}
	</script>
</head>
<body> <!-- json1.jsp -->
	<input type="button" value="가져오기" onclick="getValue()"> <p>
	<hr>
	이름 : <span id="name"></span> <p>
	나이 : <span id="age"></span> <p>
	핸드폰 : <span id="phone"></span> <p>
</body>
</html>