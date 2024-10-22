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
<!-- 1900년부터 2024년까지를 select 태그로 만들기 -->
<select>
<%
	for(int i=1900;i<=2024;i++)
	{
%>
	<option value="<%=i %>"> <%=i %> </option>
<%
	}
%>	
</select>

<select>
<c:forEach var="year" begin="1990" end="2024">
	<option value="${year}"> ${year}</option>
</c:forEach>
</select>
</body>
</html>