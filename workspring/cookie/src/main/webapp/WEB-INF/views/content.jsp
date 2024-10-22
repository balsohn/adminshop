<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function addCart() {
			var chk=new XMLHttpRequest();
			chk.onload=function() {
				if(chk.responseText=="1")
					   alert("서버오류");
				   else
				       if(confirm("장바구니로 이동하시겠습니까?"))
				       {
				    	   location="cartView";
				       }
			}
			chk.open("get","addCart?pcode=${pcode}");
			chk.send();
		}
	</script>
</head>
<body> <!-- proContent.jsp -->
	<p align="center">컴퓨터 상품 </p>
	<p align="center">
		<img src="resources/product/${img }" width="200">
	</p>
	<p>
		<input type="button" value="장바구니 담기" onclick="addCart()">
		<input type="submit" value="구매하기">
	</p>
</body>
</html>