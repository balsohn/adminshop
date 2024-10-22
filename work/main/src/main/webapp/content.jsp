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
	
	String pager=request.getParameter("pager");
	String id=request.getParameter("id");
	String sql="select * from pageboard where id=?";
	String type=request.getParameter("type");
	
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setString(1, id);
	
	ResultSet rs=pstmt.executeQuery();
	
	rs.next();
	
	String rtype="";
	switch(rs.getInt("type"))
	{
	case 0:rtype="공지사항";break;
	case 1:rtype="질답게시판";break;
	case 2:rtype="자유게시판";break;
	}
	
	String fname="";
	if(rs.getString("fname")==null)
	{
%>
		<script>
			window.onload = function() {
		    var element = document.getElementById("aa");
		        element.parentElement.removeChild(element);
		    }
		</script>
<%	
	}
	
	
%>
	<table id="container">
		<caption><h2>게시물</h2></caption>
		<tr>
			<td>제목</td>
			<td><%=rs.getString("title") %></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><%=rs.getString("name") %></td>
		</tr>
		<tr>
			<td>게시판종류</td>
			<td><%=rtype%></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><%=rs.getString("content").replace("\r\n","<br>") %></td>
		</tr>
		<tr id="aa">
			<td>사진</td>
			<td><img src="file/<%=rs.getString("fname")%>" width="200"></td>
		</tr>
		<tr>	
			<td>
				<a href="update.jsp?id=<%=id %>&pager=<%=pager %>">수정하기</a>
				<a href="list.jsp?pager=<%=pager%>">목록가기</a>
			</td>
		</tr>
	</table>
	
</body>
</html>
<%
	rs.close();
	conn.close();
	pstmt.close();
%>
