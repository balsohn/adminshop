<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
   #top {
     width:1000px;
     height:200px;
     margin:auto;
     background:yellow;
   }
   #bottom {
     width:1000px;
     height:100px;
     margin:auto;
     background:black;
   }
   
 </style>
 
</head>
<body> <!-- /common/default.jsp -->


<decorator:head/>

  <div id="top"> 메뉴및 로그인 등등 ,
     오늘은 즐거운 수요일 <p>
    안녕 </div>
    
    <decorator:body/>
    
    
    
   <div id="bottom"> 회사소개및 내용 </div>
</body>
</html>