<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function delCart(a){
			var chk=new XMLHttpRequest();
			chk.onload=function() {
				var pp=chk.responseText.trim();
				if(pp=="0" || pp=="2") {
					location.reload();
				}
			}
			chk.open("get","delCart?pcode="+a);
			chk.send();
		} 
	</script>
</head>
<body> <!-- cartView.jsp -->
  <c:forEach items="${pcode}" var="pcode">
  <c:if test="${not empty pcode}">
   <p align="center"> 
      ${pcode}  <input type="button" value="X" onclick="delCart('${pcode}')">
   </p>
   </c:if>
  </c:forEach>
  <p align="center"> <a href="list">목록</a></p>
</body>
</html>