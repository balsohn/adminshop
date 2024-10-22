<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="com.oreilly.servlet.*" %>
<%@page import="com.oreilly.servlet.multipart.*" %>
<%
	

	String path=request.getRealPath("/file");

	int size=1024*1024*30;
	MultipartRequest multi=new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy());
	
	Class.forName("com.mysql.jdbc.Driver"); // 라이브러리를 찾아라
	String db="jdbc:mysql://localhost:3306/second";
	Connection conn=DriverManager.getConnection(db,"root","1234");
	
	
	PreparedStatement pstmt=null;
	
	String id=multi.getParameter("id");
	String title=multi.getParameter("title");
	String name=multi.getParameter("name");
	String pwd=multi.getParameter("pwd");
	String content=multi.getParameter("content");
	String type=multi.getParameter("type");
	String fname=multi.getFilesystemName("fname");
	String sql="insert into pageboard (title,name,pwd,content,type,fname,writeday) values (?,?,?,?,?,?,now())";
	
	pstmt=conn.prepareStatement(sql);
	pstmt.setString(1, title);
	pstmt.setString(2, name);
	pstmt.setString(3, pwd);
	pstmt.setString(4, content);
	pstmt.setString(5, type);
	pstmt.setString(6, fname);
	
	pstmt.executeUpdate();
	
	pstmt.close();
	conn.close();
	
	
	response.sendRedirect("list.jsp");
	
	
%>