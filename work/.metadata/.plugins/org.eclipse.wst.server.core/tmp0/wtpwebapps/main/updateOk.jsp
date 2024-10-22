<%@page import="com.oreilly.servlet.multipart.*"%>
<%@page import="com.oreilly.servlet.*"%>
<%@page import="java.io.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
	Class.forName("com.mysql.jdbc.Driver"); // 라이브러리를 찾아라
	String db="jdbc:mysql://localhost:3306/second";
	Connection conn=DriverManager.getConnection(db,"root","1234");

	String path=request.getRealPath("/file");
	int size=1024*1024*30;
	MultipartRequest multi=new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy());
	
	String fname=multi.getFilesystemName("fname");
	String id=multi.getParameter("id");
	String pager=multi.getParameter("pager");
	String title=multi.getParameter("title");
	String name=multi.getParameter("name");
	String type=multi.getParameter("type");
	String content=multi.getParameter("content");
	String pwd=multi.getParameter("pwd");
	
	String sql2="select count(*) as cnt,fname from pageboard where id=? and pwd=?";
	PreparedStatement pstmt2=conn.prepareStatement(sql2);
	pstmt2.setString(1, id);
	pstmt2.setString(2, pwd);
	
	ResultSet rs=pstmt2.executeQuery();
	rs.next();
	String fname2=rs.getString("fname");
	
	int cnt=rs.getInt("cnt");
	
	if(cnt==1)
	{
		PreparedStatement pstmt=null;
		if(fname==null)
		{	
			String sql="update pageboard set title=?, name=?, type=?, content=? where id=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, type);
			pstmt.setString(4, content);
			pstmt.setString(5, id);
			
			pstmt.executeUpdate();
			
		}
		else
		{
			
			String sql="update pageboard set title=?, name=?, type=?, content=?, fname=? where id=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, type);
			pstmt.setString(4, content);
			pstmt.setString(5, fname);
			pstmt.setString(6, id);
			
			// 기존의 삭제 삭제하기
			File file=new File(path+"/"+fname2);
			if(file.exists())
			{
				file.delete();
			}
		}
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
		response.sendRedirect("content.jsp?id="+id+"&pager="+pager);
	}
	else
	{
		File file=new File(path+"/"+fname);
		if(file.exists())
		{
			file.delete();
		}
		
		conn.close();
		
		response.sendRedirect("update.jsp?id="+id+"&pager="+pager);
	}
	
	
	
	
	 
%>