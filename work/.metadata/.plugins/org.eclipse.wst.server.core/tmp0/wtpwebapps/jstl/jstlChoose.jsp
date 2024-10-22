<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- jstlChoose.jsp -->
<!-- java에 있는 switch와 비슷한 구문 => choose~when -->
<%
	request.setAttribute("food", "2");
%>
	<c:choose>
		<c:when test="${food==1}">
			짜장면을 주문했습니다.
		</c:when>
		<c:when test="${food==2}">
			짬뽕을 주문했습니다.
		</c:when>
		<c:when test="${food==3}">
			밀면을 주문했습니다.
		</c:when>
		<c:when test="${food==4}">
			육개장을 주문했습니다.
		</c:when>
		<c:otherwise>
			값이 잘못 입력 되었습니다.
		</c:otherwise>
	</c:choose>
</body>
</html>