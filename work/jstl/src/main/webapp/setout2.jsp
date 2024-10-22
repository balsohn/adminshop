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

<c:set var="age" value="33"/>
<hr>
이름 : ${name } <p>
나이 : ${age } <p>
<hr>
이름 : <c:out value="${name }" default="없네요"/>
</body>
</html>