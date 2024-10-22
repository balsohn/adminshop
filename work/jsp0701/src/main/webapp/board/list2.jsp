<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <style>
   table {
     border-spacing:0px; /* 셀과 셀 간격 == cellspacing */
   }
   table td {
     border-bottom:1px solid black;
     padding:5px;
     height:35px;
   }
   table tr:first-child td {
     border-top:2px solid black;
     border-bottom:2px solid black;
   }
   table tr:last-child td {
     border-bottom:2px solid black;
   }
   a {
      text-decoration:none;
      color:black;
   }
   a:hover {
      text-decoration:underline;
      color:green;
   }
   #btn {
      color:black;
      text-decoration:none;
      border:1px solid green;
      /*
      display:inline-block;
      width:130px;
      height:30px;
      text-align:center;
      line-height:30px;
      */
      /*
      padding-left:20px;
      padding-right:20px;
      padding-top:4px;
      padding-bottom:4px;
      */
      padding:4px 20px; /* 상하 좌우 */
      
   }
 
   </style>
    <script>
   function chgRecord(rcnt)
   {
	   location="list2.jsp?pageSize="+rcnt; //페이지값은 보내지 않습니다.. // list.jsp?rcnt=20
   }
   window.onload=function()
   {
	   
   }
 </script>
</head>
<body> <!-- list.jsp -->
<%@page import="board.*" %>  
<%
    // board테이블에 있는 레코드를 가져와서 출력
    Board board=new Board();
    ResultSet rs=board.list(request);
    
    int pstart=(int)request.getAttribute("pstart");
    int pend=(int)request.getAttribute("pend");
    int chong=(int)request.getAttribute("chong");
    int pageSize=(int)request.getAttribute("pageSize");
    
    out.print(pstart+" "+pend+" "+chong+" "+pageSize);
%>
	
    <table width="800" align="center">
      <caption> <h3> 게시판 </h3></caption>
      <tr>
      	<td colspan="4" align="right">
      		<input type="button" value="10" onclick="chgRecord(10)">
      		<input type="button" value="20" onclick="chgRecord(20)">
      		<input type="button" value="30" onclick="chgRecord(30)">
      		<input type="button" value="50" onclick="chgRecord(50)">
      	</td>
      </tr>
      <tr>
        <td> 작성자 </td>
        <td> 제 목 </td>
        <td> 조회수 </td>
        <td> 작성일 </td>
      </tr>
<%    
    // 출력
    while(rs.next())
    {
%>    
      <tr>
        <td> <%=rs.getString("name")%> </td>
        <td> <a href="readnum.jsp?id=<%=rs.getInt("id")%>"> <%=rs.getString("title")%> </a> </td>
        <td> <%=rs.getString("readnum")%> </td>
        <td> <%=rs.getString("writeday")%> </td>
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
        	<td>
    <!-- 현재페이지에서 다음그룹으로 -->
    
	<!-- 현재페이지에서 맨 끝으로 -->
<%
if(pstart>1)
{
%>
	<a href="list.jsp?page=1&pageSize=<%=pageSize%>"> 처음으로 </a>
<%
}

if(pstart>1)
{
%>
	<a href="list.jsp?page=<%=pstart-1 %>&pageSize=<%=pageSize%>">이전</a>
<%	
}

	for(int i=pstart;i<=pend;i++)
	{
		String imsi="";
		if((int)request.getAttribute("page")==i)
		{
			imsi="style='color:red'";
		}
%>   

	<a href="list.jsp?page=<%=i %>?pageSize=<%=pageSize %>" <%=imsi %>><%=i %></a>

<%
	}
	if(pend<chong)
	{		
%>
		<a href="list.jsp?page=<%=pend+1 %>&pageSize=<%=pageSize%>"> 다음 </a>
<%
	}
	if(pend<chong)
	{
%>
		<a href="list.jsp?page=<%=chong %>&pageSize=<%=pageSize%>"> 마지막 </a>
<%				
	}
%>		
	<!-- 현재페이지에서 다음그룹으로 -->
	<!-- 현재페이지에서 맨 끝으로 -->
	</td>
   </tr>
   </table>

<%
    // 닫기
    board.closeAll();
%>
</body>
</html>














