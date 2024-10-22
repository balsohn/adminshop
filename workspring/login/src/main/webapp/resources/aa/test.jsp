<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <style>
    body {
      margin:0px;
    }
    #first {
      width:100%;
      height:40px;
      background:#aaaaaa;
      position:relative;
    }
    #first #inner{
      width:1000px;
      height:40px;
      line-height:40px;
      color:white;
      background:blue;
      margin:auto;
      text-align:center;
      
    }
    #first #layer {
      position:absolute;
      color:red;
      top:4px;
    }
  </style>
  <script>
   function check()
   {
	   if(innerWidth>=1000)
	   document.getElementById("layer").style.left=(innerWidth-20)+"px";
   }
   window.onresize=check;
 
  </script>
</head>
<body onload="check()">
   <div id="first">
    <div id="inner"> <span onclick="view()"> 학교종이 땡땡땡 어서모이자 </span> 
    </div>
    <div id="layer">X</div>
   </div>
</body>
</html>