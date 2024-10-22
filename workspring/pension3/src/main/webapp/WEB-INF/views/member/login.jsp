<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		section { width: 1000px; height: 600px; margin: auto; border: 1px solid black; text-align: center;}
		section div {margin-top: 10px;}
		section div input {border: 1px solid green; outline:none;}
		section #txt {width: 400px; height: 40px;}
		section #pwdx {width: 400px; height: 40px;}
		section #sub {width: 406px; height: 44px;}
		section #sub:hover {background:green; color:white;}
		span {font-size: 11px;}
	</style>
	<script>
		function check(my) {
			if(my.userid.value.trim().length==0) {
				alert("아이디를 입력하세요.");
				return false;
			}
			else if(my.pwd.value.trim().length==0) {
				alert("비밀번호를 입력하세요.");
				return false;
			}
			else {
				return true;
			}
		}
	</script>
</head>
<body>
	<section>
		<form method="post" action="loginOk" onsubmit="return check(this)">
			<h3>로 그 인</h3>
			<div> <input type="text" name="userid" placeholder="아이디" id="txt"> </div>
			<div> <input type="password" name="pwd" placeholder="비밀번호" id="pwdx"> </div>
			<div id="submit"> <input type="submit" value="로그인" id="sub"></div>
		</form>
	<c:if test="${err==1}"><span style="color:red;">정보를 확인해주세요.</span></c:if>
	</section>
</body>
</html>