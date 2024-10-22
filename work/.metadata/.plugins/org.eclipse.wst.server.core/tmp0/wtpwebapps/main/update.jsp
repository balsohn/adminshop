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
	
	String id=request.getParameter("id");
	String pager=request.getParameter("pager");
	String sql="select * from pageboard where id=?";
	
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setString(1, id);
	
	ResultSet rs=pstmt.executeQuery();
	
	rs.next();
%>
	<form method="post" action="updateOk.jsp" enctype="multipart/form-data">
	<table id="container">
	<input type="hidden" name="id" value="<%=id %>">
	<input type="hidden" name="pager" value="<%=pager%>">
		<caption><h2>게시글 수정</h2></caption>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" id="title" value="<%=rs.getString("title")%>"></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="name" id="name" value="<%=rs.getString("name")%>"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pwd" id="pwd"></td>
		</tr>
		<tr>
			<td>게시판종류</td>
			<td>
				<select name="type" id="type">
					<option value="자유게시판">자유게시판</option>
					<option value="Q&A">Q&A</option>
					<option value="공지사항">공지사항</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content" id="content"><%=rs.getString("content") %></textarea>
		</tr>
		<tr>
			<td>사진 </td>
			<td>
				<img src="file/<%=rs.getString("fname") %>" width="100"> <p>
				<input type="file" name="fname"> <p> 파일을 선택하시면 사진이 변경됩니다.
		</tr>
		<tr>	
			<td>
				<input type="submit" value="수정하기" id="submit">
				<a href="list.jsp?pager=<%=pager%>">목록가기</a>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>