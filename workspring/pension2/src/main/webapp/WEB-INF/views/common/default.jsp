<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		body {
			margin: 0px;
		}
		#outer {
			width:100%;
			height: 40px;
			background: green;
		}
		#outer #first {
	      width:1000px;
	      height:40px;
	      line-height:40px;
	      margin:auto;
	      background:green;
	      text-align:center;
	      color:white;
	   }
	   #outer #first #left {
			float: left;
			width:960px;
	   }
	   #outer #first #right {
			float: right;
			width: auto;	  
	   }
	   header {
			width:1000px;
			height: 90px;
			margin:auto;
			border:1px solid black;
	   }
	   header #left {
			float: left;
			width:40%;
			text-align: left;
			margin-left: 10px;	   
	   }
	   header #right {
	   		float: right;
	   		width:40%;
	   		text-align: right;
	   		margin-right: 10px;
	   }
	   nav {
	   		border: 1px solid black;
	   		width: 1000px;
	   		height: 50px;
	   		margin: auto;
	   }
	</style>
</head>
<body>
	<div id="outer">
		<div id="first">
			<div id="left">광고성 글</div>
			<div id="right">X</div>
		</div>
	</div>
	<header>
		<div id="left"> 로고 </div>
		<div id="right"> 
			로그인 회원가입 문의하기	
		</div>
	</header>
	<nav> 메뉴 </nav>
	
	
	
	
	
	
	
	<footer> 펜션 정보 </footer>
</body>
</html>