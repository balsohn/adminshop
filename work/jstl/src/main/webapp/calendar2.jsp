<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- calendar.jsp -->
<%@page import="java.time.LocalDate" %>
<%
    // 달력 만들기
    // 달력 필요한 값 => 1일의 요일, 총일수, 몇주인가
    // 기준이 되는 날짜정보 => 오늘 기준의 달력
    int year,month;
    if(request.getParameter("year")==null)
    {
    	LocalDate today=LocalDate.now(); // 오늘 현재의 날짜(2024-07-04)  // of(특정일);
        year=today.getYear();
        month=today.getMonthValue();
    }
    else
    {
    	year=Integer.parseInt(request.getParameter("year"));
    	month=Integer.parseInt(request.getParameter("month"));		
    }
    
    // 오늘기준으로 요일, 총일수
    //out.print(today.getDayOfWeek().getValue()); // 1(월)~7(일)
    //out.print(today.lengthOfMonth());
    LocalDate xday=LocalDate.of(year,month,1);
    int yoil=xday.getDayOfWeek().getValue();
    if(yoil==7)
    	yoil=0;
    
    int chong=xday.lengthOfMonth();
                                   // Math.round(), Math.floor(), Math.ceil()
    int ju=(int)Math.ceil( (chong+yoil)/7.0 ); // int/int의 나눗셈은 실수부분을 버린다 => int/double, double/int
    
    request.setAttribute("year", year);
    request.setAttribute("month", month); // Calendar.MONTH는 0부터 시작하므로 1을 더해줍니다.
    
%>
 <table width="400" align="center" border="1">
   <caption align="center">
   		<c:choose>
		<c:when test="${month<=1}">
		<a href="calendar2.jsp?year=${year-1}&month=12"> < </a>
		</c:when>
		<c:otherwise>
		<a href="calendar2.jsp?year=${year}&month=${month-1}"> < </a>
		</c:otherwise>
		</c:choose>
       <%=year%>년 <%=month%>월
       <c:choose>
       <c:when test="${month>=12}">
       <a href="calendar2.jsp?year=${year+1}&month=1"> > </a>
       </c:when>
       <c:otherwise>
       <a href="calendar2.jsp?year=${year}&month=${month+1}"> > </a>
       </c:otherwise>
       </c:choose>
   </caption>
   <tr>
     <td> 일 </td>
     <td> 월 </td>
     <td> 화 </td>
     <td> 수 </td>
     <td> 목 </td>
     <td> 금 </td>
     <td> 토 </td>
   </tr>
<%
   int day=1;
   for(int i=1;i<=ju;i++) // 주만큼 반복되는 행
   {
%>	  
      <tr>
     <%   
	   for(int j=0;j<7;j++) // 1행의 7일을 출력
	   {
     %>		   
         <% 
          if( ((j < yoil) && i==1) || (chong<day) )
          {
         %>
           <td> &nbsp; </td>
         <%
          }
          else
          {
         %>
		   <td> <%=day%> </td>
		 <%
		   day++;
          }
		 %>  
		   
     <%	
	   }
     %>
	  </tr>
<%	  
   }
%>  
 </table>
</body>
</html>









