<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
  section {
      width:1000px;
      height:600px;
      margin:auto;
      font-family: 'GmarketSansMedium';
   }
   section table {
     border-spacing:0px;  
     margin-bottom:200px;
   }
   section table td {
     border-bottom:1px solid green;
     padding:5px;
     height:35px;
     
   }
   section table tr:first-child td {
     border-top:2px solid green;
     border-bottom:2px solid green;
   }
   section table tr:last-child td {
     border-bottom:2px solid green;
   }
   section table a {
     text-decoration:none;
     color:black;
   }
   section #write {
     display:inline-block;
     width:100px;
     height:20px;
     background:green;
     color:white;
     text-align:center;
     text-decoration:none;
     padding-top:5px;
     padding-bottom:5px;
   }
   section #s2 {
     background:#65FF5E;
     padding:3px;
     font-size:11px;
   }
   section #s1 {
     background:#65FF5E;
     padding:3px;
     font-size:11px;
   }
  </style>
</head>
<body> <!-- board/list -->
 <section>
   <table width="800" align="center">
     <caption> <h3> 회원 게시판 </h3> </caption>
     <tr align="center">
       <td> 제 목 </td>
       <td> 작성자 </td>
       <td> 조회수 </td>
       <td> 작성일 </td>
     </tr>
    <c:forEach items="${blist}" var="bdto">
     <tr align="center">
       <td align="left"> <a href="readnum?id=${bdto.id}&page=${page}"> ${bdto.title} </a> </td>
       <td> ${bdto.name} </td>
       <td> ${bdto.readnum} </td>
       <td> ${bdto.writeday} </td>
     </tr>
    </c:forEach>
     <tr>
      <td colspan="4" align="center">
        <!-- 이전 그룹 -->
         <c:if test="${pstart!=1}">
          <a href="list?page=${pstart-1}"> ◁◁ </a>
         </c:if>
         <c:if test="${pstart==1}">
          ◁◁
         </c:if>
        
        <!-- 이전 페이지 -->
         <c:if test="${page != 1}">
          <a href="list?page=${page-1}"> ◁ </a>
         </c:if>
         <c:if test="${page == 1}"> 
          ◁
         </c:if>
         
        <c:forEach var="i" begin="${pstart}" end="${pend}">
         <c:if test="${page == i}"> <!-- 현재페이지랑 출력된 i의 값이 같을때 -->
          <a href="list?page=${i}" style="color:red;"> ${i} </a>
         </c:if>
         <c:if test="${page != i}">
          <a href="list?page=${i}"> ${i} </a>
         </c:if> 
        </c:forEach>
        
        <!-- 다음페이지 -->
         <c:if test="${page != chong}">
          <a href="list?page=${page+1}"> ▷ </a>
         </c:if>
         <c:if test="${page == chong}"> 
          ▷
         </c:if>
         
         <!-- 다음 그룹 -->
         <c:if test="${pend!=chong}"> 
          <a href="list?page=${pend+1}"> ▷▷ </a>
         </c:if>
         <c:if test="${pend==chong}">
          ▷▷
         </c:if>
       </td>
     </tr>
     <tr align="right">
       <td colspan="4"> <a href="write" id="write"> 글쓰기 </a> </td>
     </tr>
   </table>
  </section>
</body>
</html>


