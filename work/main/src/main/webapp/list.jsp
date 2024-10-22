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
	
	int pager;
	
	if(request.getParameter("pager")==null)
	{
		pager=1;
	}
	else
	{
		pager=Integer.parseInt(request.getParameter("pager"));
	}
	
	int index=(pager-1)*10;
	int pstart,pend;
	int p=(pager-1)/10;
	
	pstart=p*10+1;
	pend=pstart+9;
	
	// 총 페이지를 type별로 구하기
	String type=request.getParameter("type");
	String search=request.getParameter("search");
	int searchType;
	if(request.getParameter("searchType")==null)
	{
		searchType=-1;
	}
	else
	{
		searchType=Integer.parseInt(request.getParameter("searchType"));
	}
	
	String searchText="";
	String sql2="select ceil(count(*)/10) as chong from pageboard";
	if(type!=null && search!=null)
	{
		switch(searchType)
		{
		case 0:searchText=" where type=? and title like ?";break;
		case 1:searchText=" where type=? and title like ? or content like ?"; break;
		case 2:searchText=" where type=? and name like ?"; break;
		}
	}
	else if(type!=null)
	{
		searchText=" where type=?";
	}
	else if(search!=null)
	{
		switch(searchType)
		{
		case 0:searchText=" where title like ?";break;
		case 1:searchText=" where title like ? or content like ?"; break;
		case 2:searchText=" where name like ?"; break;
		}
	}
	
	/* String sql2;
	if(type==null)
	{
		sql2="select ceil(count(*)/10) as chong from pageboard";
	}
	else
	{
		sql2="select ceil(count(*)/10) as chong from pageboard where type=?";
	} */
	
	// 심부름꾼 생성 + setter
	
	sql2=sql2+searchText;
	int searchIndex=1;
	PreparedStatement pstmt2=conn.prepareStatement(sql2);
	if(type!=null)
	{
		pstmt2.setString(searchIndex++,type);
		// String sql2="select ceil(count(*)/10) as chong from pageboard where type=?";
	}
	if(search!=null)
	{
		pstmt2.setString(searchIndex++, "%"+search+"%");
		// String sql2="select ceil(count(*)/10) as chong from pageboard where title like ?";
		if(searchType==1)
		{
			pstmt2.setString(searchIndex++, "%"+search+"%");
			// String sql2="select ceil(count(*)/10) as chong from pageboard where title like ? or content like ?";
		}
	}
	
	ResultSet rs2=pstmt2.executeQuery();
	rs2.next();
	int chong=rs2.getInt("chong");
	
	if(chong<pend)
	{
		pend=chong;
	}
	
	String sql="select * from pageboard"+searchText+" order by case when type=0 then 1 else 2 end, id desc limit ?,10";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	
	
	searchIndex=1;
	if(type!=null)
	{
		pstmt.setString(searchIndex++,type);
	}
	if(search!=null)
	{
		pstmt.setString(searchIndex++, "%"+search+"%");
		if(searchType==1)
		{
			pstmt.setString(searchIndex++, "%"+search+"%");
		}
	}
	
    pstmt.setInt(searchIndex, index);
    ResultSet rs=pstmt.executeQuery();
	/* String sql;
	if(type==null)
	{
		 sql="(select * from pageboard where type='공지사항' order by id desc)"
				+" union all "+"(select * from pageboard where type!='공지사항' order by id desc limit ?,10)"; 
		sql="select * from pageboard order by case when type='공지사항' then 1 else 2 end, id limit ?,10";
	}
	else
	{
		sql="select * from pageboard where type=? order by id desc limit ?,10";
	}
	PreparedStatement pstmt=conn.prepareStatement(sql); 
	if(type==null)
	{
		pstmt.setInt(1, index);
	}
	else
	{
		pstmt.setString(1, type);
		pstmt.setInt(2, index);
	}
	
	ResultSet rs=pstmt.executeQuery(); */
	String param="";
	if(type!=null && search!=null)
	{
		param="&type="+type+"&search="+search+"&searchType="+searchType;
	}
	else if(type!=null)
	{
		param="&type="+type;
	}
	else if(search!=null)
	{
		param="&search="+search+"&searchType="+searchType;
	}
	
%>	
     <form method="post" action="list.jsp">
     <input type="hidden" name="type" value="<%=request.getParameter("type") %>">
     <tr>
     	<td>
     		<select name="searchType">
     			<option value="0">제목</option>
     			<option value="1">제목+내용</option>
     			<option value="2">작성자</option>
     		</select>
     	</td>
     	<td>
     		<input type="text" name="search">
     		<input type="submit" value="검색">
     	</td>
     </tr>
     	
     </form>
	<table>
		<tr>
			<td><a href="list.jsp">전체글보기</a></td>
			<td><a href="list.jsp?type=1">자유게시판</a></td>
			<td><a href="list.jsp?type=2">질답게시판</a></td>
			<td><a href="list.jsp?type=0">공지사항</a></td>
		</tr>
	</table>
	<table>
		<tr>
			<td>게시판종류</td>
			<td>제목</td>
			<td>작성자</td>
			<td>조회수</td>
			<td>작성일</td>
		</tr>
<%
	while(rs.next())
	{
		String rtype="";
		switch(rs.getInt("type"))
		{
		case 0:rtype="공지사항";break;
		case 1:rtype="질답게시판";break;
		case 2:rtype="자유게시판";break;
		}
%>		
		<tr>
			<td><%=rtype %></td>
			<td><a href="content.jsp?id=<%=rs.getInt("id")%>&pager=<%=pager%>"><%=rs.getString("title") %></a></td>
			<td><%=rs.getString("name") %></td>
			<td><%=rs.getInt("readnum") %></td>
			<td><%=rs.getString("writeday") %></td>
		</tr>
<%
	}
%>
		<tr>
       <td colspan="4" align="right">
          <a href="write.jsp" id="btn"> 글쓰기 </a>
       </td>
     </tr>
     
     <tr>
       <td colspan="4" align="center">
         <!-- 페이지 링크 출력  : pstart부터 pend => 숫자클릭하면 => list.jsp?pager=페이지   -->
         
         <!-- 이전 그룹 이동 -->
       <%
        if(pstart != 1) // 첫번재 그룹이 아니면 된다.. 
        {
       %>  
         <a href="list.jsp?pager=<%=pstart-1%><%=param%>"> << </a>
       <%
        }
        else
        {
       %>  
         
       <%
        }
       %>
       
         
         <!-- 이전페이지 이동 -->
       <%
        if(pager != 1)
        {
       %>  
         <a href="list.jsp?pager=<%=pager-1%><%=param%>"> < </a> <!-- 1페이지가 아닐때 -->
       <%
        }
        else
        {
       %>  
            <!-- 1페이지일때는 링크 X -->
       <%
        }
       %>  
         
         
         <%
         
           for(int i=pstart;i<=pend;i++)
           {
        	   String imsi="";
        	   if(pager==i)
        	   {
        		   imsi="style='color:red;border:1px solid black;'";
        	   }
         %>	  
              <a href="list.jsp?pager=<%=i%><%=param%>" <%=imsi%> class="link"> <%=i%> </a>
         <%
           }
         %>
         
         <!-- 다음페이지 이동 -->
        <%
         if(pager != chong)
         {
        %> 
         <a href="list.jsp?pager=<%=pager+1%><%=param%>"> > </a>
        <%
         }
         else
         {
        %> 
         
        <%
         }
        %> 
        
        <!-- 다음 그룹 이동 -->
        <%
        if(pend != chong) // 마지막 그룹은 pend와 chong가 같다
        {
        %> 
         <a href="list.jsp?pager=<%=pend+1%><%=param%>"> >> </a>
        <%
        }
        else
        {
        %>
         
        <%
        }
        %>
       </td>
     </tr>
     <form method="post" action="list.jsp">
     <tr>
     	<td>
     		<select name="searchType">
     			<option value="0">제목</option>
     			<option value="1">제목+내용</option>
     			<option value="2">작성자</option>
     		</select>
     	</td>
     	<td>
     		<input type="text" name="search">
     		<input type="submit" value="검색">
     	</td>
     </tr>
     	
     </form>
	</table>
</body>
</html>
<%
	rs.close();
	rs2.close();
	pstmt.close();
	pstmt2.close();
	conn.close();
%>