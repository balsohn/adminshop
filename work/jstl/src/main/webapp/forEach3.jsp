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
<c:forEach var="year" begin="0" end="50">
	<option value="${2024-year}"> ${2024-year}</option>
</c:forEach>
</select>
</body>
</html>