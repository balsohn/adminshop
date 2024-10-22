<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 	<!-- start.jsp -->

<!-- 
	jsp: Java Server Page
		=>html, css, javascript로 구성된 문서 + 서버에서 동작하는 자바코드 
-->

<%@page import="java.sql.*"%>

<%
	//DB연결
	Class.forName("com.mysql.jdbc.Driver"); //mysql과 연결할 드라이버 클래스를 찾아라 
	String db="jdbc:mysql://localhost:3306/first";
	Connection conn=DriverManager.getConnection(db,"root","1234");
	
	String sql="select * from friend";
	
	PreparedStatement pstmt=conn.prepareStatement(sql);
	
	//실행 
	ResultSet rs=pstmt.executeQuery(); //select는 무조건 executeQuery()
	
	while(rs.next())
	{
		out.print(rs.getString("name")+ " ");
		out.print(rs.getString("juso")+ " ");
		out.print(rs.getString("phone")+"<p>");
	}

%>
<%
	//스크립트릿 
	//자바코드를 포함시키는 영역 
	//int kor=99;
	//int eng=88;
	//int hap=kor+eng;
	
	//클라이언트에서 보내고자 하는 정보는 웹문서에 출력시킨다 
	
	//out.print("합계 : "+hap); //현재문서에 출력 
%>
	


</body>
</html>