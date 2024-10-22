<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%
	Class.forName("com.mysql.jdbc.Driver"); // 라이브러리를 찾아라
	String db="jdbc:mysql://localhost:3306/second";
	Connection conn=DriverManager.getConnection(db,"root","1234");
	
	request.setCharacterEncoding("utf-8");
	String title=request.getParameter("title");
	String name=request.getParameter("name");
	String pwd=request.getParameter("pwd");
	String content=request.getParameter("content");
	String id=request.getParameter("id");
	
	String sql="update pageboard set title=?, name=?, content=? where id=?";
	
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setString(1, title);
	pstmt.setString(2, name);
	pstmt.setString(3, content);
	pstmt.setString(4, id);
	
	pstmt.executeUpdate();
	
	response.sendRedirect("content.jsp?id="+id);
%>
</body>
</html>