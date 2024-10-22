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
     margin-bottom:200px;
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
</head>
<body> <!-- list.jsp -->
<%@page import="board.Board" %>  
<%@page import="java.sql.ResultSet" %>
<%
    // board테이블에 있는 레코드를 가져와서 출력
    Board board=new Board();
    //board.init();
    ResultSet rs=board.list(request);
   
    // request영역에 있는 pstart, pend가져오기
    int pstart=Integer.parseInt(request.getAttribute("pstart").toString());
    int pend=Integer.parseInt(request.getAttribute("pend").toString());
    int pager=Integer.parseInt(request.getAttribute("pager").toString());
    int chong=Integer.parseInt(request.getAttribute("chong").toString());
    //out.print(pstart+" "+pend);
%>
    <table width="800" align="center">
      <caption> <h3> 게시판 </h3></caption>
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
       <td colspan="4" align="center" style="font-size:22px">
       <!-- 현재페이지의 이전 그룹 -->
       <a href="list.jsp?pager=<%=pstart-1%>"> ◁◁ </a>
       
       <!-- 현재페이지에서 1페이지 이전으로 이동 단 현재페이지가 1페이지이면 동작하면 안된다.. -->
     <%
      if(pager!=1)
      {
     %>  
       <a href="list.jsp?pager=<%=pager-1%>"> ◁ </a>
     <%
      }
      else
      {
     %>  
       ◁
     <%
      }
     %> 
     
       <%
          // pstart부터 pend까지 출력하기
        for(int i=pstart;i<=pend;i++)
        {
        	// 현재페이지의 색은 빨간색으로
          if(pager==i)
          {
       %>
           <a href="list.jsp?pager=<%=i%>" style="color:red;"> <%=i%> </a>  <!-- list.jsp?page=숫자 -->
       <%
          }
          else
          {
       %>
           <a href="list.jsp?pager=<%=i%>"> <%=i%> </a>  <!-- list.jsp?page=숫자 -->
       <% 	  
          }
        }
       %>
       
       <!-- 현재페이지에서 1페이지 다음 : 마지막 페이지에서 다음페이지는 X -->
       <%
       if(pager != chong)
       {
       %>
         <a href="list.jsp?pager=<%=pager+1%>"> ▷ </a>       
       <%
       }
       else
       {
       %>
         ▷
       <%
       }
       %>
       <!-- 현재페이지의 그룹에서 다음그룹 -->
       </td>
     </tr>
   </table>
<%
    // 닫기
    board.allClose();
%>
</body>
</html>














