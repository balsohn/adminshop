<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		// json데이터는 자바스크립트에서 인식하는 객체
		var name="홍길동";
		var age="33";
		function test() {
			//함수에서 body부분에 필요한 값을 전달하기
			document.getElementById("aa").innerText=name;
			document.getElementById("bb").innerText=age;
		}
		
		function getData() {
			var chk=new XMLHttpRequest();
			chk.onload=function() {
				var data=JSON.parse(chk.responseText);
				alert(data.name+" "+data.age);
				
			}
			chk.open("get","getData");
			chk.send();
		}
	</script>
</head>
<body>	<!-- myjson.jsp -->
	<input type="button" onclick="test()" value="확인"> 
	<hr>
	<div id="aa"></div>
	<div id="bb"></div>
	
	<hr>
	비동기 방식으로 서버에 접근하여 데이터 가져오기 <p>
	<input type="button" value="가져오기" onclick="getData()">
</body>
</html>