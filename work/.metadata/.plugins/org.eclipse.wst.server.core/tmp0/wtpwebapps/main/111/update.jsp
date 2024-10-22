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
	
	String id=request.getParameter("id");
	
	String sql="select * from pageboard where id=?";
	
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setString(1, id);
	
	ResultSet rs=pstmt.executeQuery();
	rs.next();
	
%>
	<form method="post" action="updateOk.jsp">
	<table>
		<caption><h2>게시글</h2></caption>
		<input type="hidden" name="id" value="<%=id%>">		
		<tr>	
			<td> 제목 </td>
			<td> <input type="text" name="title" value="<%=rs.getString("title")%>"></td>
		</tr>
		<tr>
			<td> 작성자 </td>
			<td> <input type="text" name="name" value="<%=rs.getString("name") %>"> </td>
		</tr>
		<tr>
			<td> 비밀번호 </td>
			<td> <input type="password" name="pwd"> </td>
		</tr>
		<tr>
			<td> 내용 </td>
			<td> <textarea name="content"> <%=rs.getString("content") %></textarea> </td>
		</tr>
		
		<tr>
			<td>
				<input type="submit" value="수정하기">
				<a href="list.jsp">목록가기</a>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>