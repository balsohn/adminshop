<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="useridSearch1">
		<div> <input type="text" name="name" placeholder="이름"></div>
		<div> <input type="text" name="phone" placeholder="핸드폰 번호"> </div>
		<div> <input type="submit" value="아이디 찾기"></div>
	</form>
	<c:if test="${param.userid!=null}"> 사용자의 아이디 : ${param.userid}</c:if>
	<c:if test="${param.err==1}"> 일치하는 정보가 없습니다. </c:if>
</body>
</html>