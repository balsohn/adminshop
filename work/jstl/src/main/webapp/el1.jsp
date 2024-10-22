<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	<!-- el1.jsp -->
<%
	int kor=99;
	
	// java code + web code(html,css,javascript) 분리
	// java => 값을 전달 => web code
	
	pageContext.setAttribute("name", "홍길동");
	request.setAttribute("name","배트맨");
	session.setAttribute("name", "슈퍼맨");
	application.setAttribute("name", "뽀로로");
%>
EL표현식으로 출력
pageContext : ${pageScope.name } <p>
request : ${requestScope.name } <p>
session : ${sessionScope.name } <p>
application : ${applicationScope.name }

<hr>
영역에 관계없이 변수를 표현식에 출력 <p>
${name }
</body>
</html>