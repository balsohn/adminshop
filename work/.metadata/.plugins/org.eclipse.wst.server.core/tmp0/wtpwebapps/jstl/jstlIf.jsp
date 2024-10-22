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
	<!-- jstl을 사용하기 위해서
		1. 해당 라이브러리 파일을 다운로드 해서 WEB-INF/lib/ 복사
		2. jstl의 url을 taglib로 추가
		
		core tag는 prefix가 제일 먼저 적는다	
	 -->
<%
	// 국어점수
	request.setAttribute("kor", "60");
%>
	<c:if test="${kor<80}">
	<p> 합격입니다 </p>
	</c:if>
	<c:otherwise>
	<p> 불합격입니다 </p>
	</c:otherwise>
</body>
</html>