<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table .answer {
		position:relative;
	}
	
	table .aform {
		position:absolute;
		left:100px;
		width:300px;
		height: 150px;
		display: none;
		background:white;
		border: 1px solid black;
		
	}
	
	.aform textarea {
		width:280px;
		height:120px;
		border:none;
		outline: none;
	}
</style>
<script>
	function writeAnswer(n) {
		var aform=document.getElementsByClassName("aform");
		for(i=0;i<aform.length;i++) {
			aform[i].style.display="none";
		}
		
		document.getElementById(n).style.display="block";
	}
</script>
</head>
<body>
	<table>
		<tr>
			<td>상품명</td>
			<td>질문/답변</td>
			<td>내용</td>
			<td>작성자</td>
			<td>등록일</td>
		</tr>
		<c:forEach var="qdto" items="${qlist }" varStatus="sts">
		<tr>
			<td>${qdto.title }</td>
			<td>
				<c:if test="${qdto.qna==0}">
				<a href="javascript:writeAnswer('${qdto.ref}')">질문</a>
				<form method="post" action="writeAnswerOk" class="aform" id="${qdto.ref}">
					<input type="hidden" name="ref" value="${qdto.ref}">
					<input type="hidden" name="pcode" value="${qdto.pcode}">
					<textarea name="content"></textarea> <br>
					<input type="submit" value="답변 달기">
				</form>
				</c:if>
				<c:if test="${qdto.qna==1}">
				답변완료
				</c:if>
			</td>
			<td>${qdto.content }</td>
			<td>${qdto.userid }</td>
			<td>${qdto.writeday }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>