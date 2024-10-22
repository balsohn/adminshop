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
	<table>
		<caption><h2>게시글</h2></caption>
		<input type="hidden" name="id" value="<%=rs.getInt("id") %>">
		<tr>	
			<td> 제목 </td>
			<td> <%=rs.getString("title") %></td>
		</tr>
		<tr>
			<td> 작성자 </td>
			<td> <%=rs.getString("name") %> </td>
		</tr>
		<tr>
			<td> 내용 </td>
			<td> <%=rs.getString("content") %> </td>
		</tr>
		
		<tr>
			<td>
				<a href="update.jsp?id=<%=rs.getInt("id") %>">수정하기</a>
				<a href="delete.jsp?id=<%=rs.getInt("id") %>">삭제하기</a>
				목록가기
			</td>
		</tr>
	</table>
</body>
</html>