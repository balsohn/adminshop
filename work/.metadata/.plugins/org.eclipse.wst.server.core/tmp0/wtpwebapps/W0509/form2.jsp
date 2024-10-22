<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- form2.jsp -->

  <!-- 
   	2.마우스를 통해서 선택하는 형태의 태그
   	
   input tag=> type="checkbox", type="radio", select태그
  
   속성 : 
   name :  (radio, checkbox) 그룹을 묶어준다, javascript에서 접근할때, 서버에서 입력된 값을 읽을때 참고되는 이름 
   name :  (select)javascript에서 접근할때, 서버에서 입력된 값을 읽을때 참고되는 이름   
  
   value : 항목마다 값을 넣어준다
  
   checked, selected : 문서를 읽을때 선택되어 나타난다. (radio, checkbox)
   -->
   <form>
   <!--  radio는 동일한 name에서 하나만 선택이 가능 -->
   	<input type="radio" name="age" value="10" checked> 10대
   	<input type="radio" name="age" value="20"> 20대
   	<input type="radio" name="age" value="30"> 30대
   	<input type="radio" name="age" value="40" checked> 40대 
   
   <input type="radio" name="aaa"> 하하하
   <input type="radio" name="aaa"> 호호호
   <hr>
 
   	<input type="checkbox" name="food" value="0" checked > 탕수육
   	<input type="checkbox" name="food" value="1"> 짬뽕
   	<input type="checkbox" name="food" value="2" checked> 팔보채
   	<input type="checkbox" name="food" value="3"> 짜장면
   	
   	
   	<hr>
   	<select name="tong"> 
   		<option value="0"> 선 택 </option>
   		<option value="1" selected> SKT </option>
   		<option value="2"> KT </option>
    </select>
   </form>

</body>
</html>