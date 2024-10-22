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
	
	int pager=(request.getParameter("pager")==null)?1:Integer.parseInt(request.getParameter("pager"));
	int pstart,pend;
	
	int index=(pager-1)*10;
	int p=(pager-1)/10;
	
	pstart=p*10+1;
	pend=pstart+9;
	
	
	String sql="select * from pageboard order by id desc limit "+index+",10";
	
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rs=pstmt.executeQuery();
	
	
%>
	<table>
		<caption><h2>게시판</h2></caption>
		<tr>
			<td>작성자</td>
			<td>제목</td>
			<td>조회수</td>
			<td>작성일</td>
		</tr>
<%
		while(rs.next())
		{
%>		
		<tr>
			<td><%=rs.getString("name") %></td>
			<td><a href="content.jsp?id=<%=rs.getInt("id")%>"><%=rs.getString("title") %></a></td>
			<td><%=rs.getString("readnum") %></td>
			<td><%=rs.getString("writeday") %></td>
		</tr>
<%
		}
%>		
		<tr>
			<td>
				<a href="write.jsp">글쓰기</a>
			</td>
		</tr>
		<tr>
			<td>
<%
		for(int i=pstart;i<=pend;i++)
		{
%>			
				<a href="list.jsp?pager=<%=i %>"><%=i %></a>
<%
		}
%>				
			</td>
		</tr>
	</table>
</body>
</html>