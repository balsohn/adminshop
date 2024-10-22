<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <script>
  // "가입하기" 버튼을 클릭하면 자바스크립트에서 유효성 검사를 한 후 전송한다

	  
   // 1. 이름은 꼭 입력한다
  	function check1()
  	{
  		var name=document.pkc.name.value.trim();
  		var pwd=document.pkc.pwd.value.trim();
  		var sogae=document.pkc.sogae.value;
  		
  		if(name.length==0)
  		{
  			alert("아이디를 입력해주세요.");
  			return false;
  		}
  		else 
  		{
  			return true;
  		}
  	
     	 if(pwd.length<2)
    	  {
    		alert("비밀번호를 2자 이상 입력해주세요");
    		return false;
    	  }
     	 else if(pwd.length>6)
     	  {
    	 	alert("비밀번호를 6자 이하로 입력해주세요");
    	 	return false;
    	   }
     	 else
     	  {
     		 	return true;
     	  }

    	 if(sogae.length>30)
    		{
    		 	alert("30자 이내로 입력하세요");
    		 	return false;
    		}
    	 else
    		 {	
    		 	return true;
    		 }
  	}

  
  	function isLength()
    {
   	 var sogae=document.pkc.sogae.value;
   	 
   	 var len=sogae.length;
   	 
   	 document.getElementById("aa").innerText=len;	 
    }

  </script>
</head>
<body> <!-- quiz3.jsp -->

	
  <form method="post" action="ok.jsp" name="pkc" onsubmit="return check1()">
    이름 <input type="text" name="name" > <p>
    비번 <input type="password" name="pwd" > <p>
    소개 <textarea name="sogae" cols="30" rows="5" maxlength="30" onkeyup="isLength()"></textarea>
    	<span id="aa">0</span>/30 <p>
   
    <input type="submit" value="가입하기">
  </form>
  
  
</body>
</html>