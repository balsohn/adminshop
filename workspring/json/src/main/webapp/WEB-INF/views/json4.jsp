<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function getMembers(){
			var chk=new XMLHttpRequest();
			chk.onload=function() {
				var data=JSON.parse(chk.responseText);
				for (member of data) {
                    var li = document.createElement("li");
                    li.textContent = "아이디: " + member.userid + " 이름: " + member.name + " 전화번호: " + member.phone;
                    membersList.appendChild(li);
				 }
			}
			chk.open("get","getMembers");
			chk.send();
		}
	</script>
</head>
<body>	<!-- json4.jsp -->
	<input type="button" value="모든멤버" onclick="getMembers()">
		<hr>
	<ul id="membersList"></ul>
</body>
</html>