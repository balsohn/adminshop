<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>달력 예제</title>
<style>
    /* 달력 테이블 스타일 */
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        width: 14.2%;
        border: 1px solid #ddd;
        text-align: center;
        padding: 8px;
    }
    th {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
<%
	String yearParam=request.getParameter("year");
	String monthParam=request.getParameter("month");
    // 현재 날짜 정보를 가져오기 위한 Java 코드
    Calendar today=new GregorianCalendar();
    int year=(yearParam!=null)?Integer.parseInt(yearParam):today.get(Calendar.YEAR); // 현재 연도
    int month=(monthParam!=null)?Integer.parseInt(monthParam)-1 : today.get(Calendar.MONTH); // 현재 월 (0부터 시작)
    int dayOfMonth=today.get(Calendar.DAY_OF_MONTH); // 현재 일
    today.set(year, month, 1); // 현재 연도와 월의 첫 번째 날로 설정
    int firstDayOfWeek=today.get(Calendar.DAY_OF_WEEK); // 첫 번째 날의 요일 (1=일요일, 2=월요일, ...)
    int daysInMonth=today.getActualMaximum(Calendar.DAY_OF_MONTH); // 해당 월의 마지막 날 (일 수)
    
    // JSP 페이지에서 사용할 수 있도록 속성 설정
    request.setAttribute("year", year);
    request.setAttribute("month", month+1); // Calendar.MONTH는 0부터 시작하므로 1을 더해줍니다.
    request.setAttribute("firstDayOfWeek", firstDayOfWeek);
    request.setAttribute("daysInMonth", daysInMonth);
%>

<h1>${year}년 ${month}월 달력</h1>

<c:choose>
	<c:when test="${month<=1}">
		<a href="calendar.jsp?year=${year-1}&month=12"> < </a>
	</c:when>
	<c:otherwise>
		<a href="calendar.jsp?year=${year}&month=${month-1}"> < </a>
	</c:otherwise>
</c:choose>
<c:choose>
	<c:when test="${month>=12}">
		<a href="calendar.jsp?year=${year+1}&month=1">></a>
	</c:when>
	<c:otherwise>
		<a href="calendar.jsp?year=${year}&month=${month+1}">></a>
	</c:otherwise>
</c:choose>
<table>
    <tr>
        <!-- 요일 헤더 -->
        <th>일</th>
        <th>월</th>
        <th>화</th>
        <th>수</th>
        <th>목</th>
        <th>금</th>
        <th>토</th>
    </tr>
    <tr>
        <!-- 첫 번째 주의 첫 날 이전까지 빈 셀 생성 -->
        <c:forEach var="i" begin="1" end="${firstDayOfWeek - 1}">
            <td></td>
        </c:forEach>
        <!-- 달력 날짜 생성 -->
        <c:forEach var="day" begin="1" end="${daysInMonth}">
            <td>${day}</td>
            <!-- 일주일이 끝나면 새로운 행을 시작 -->
            <c:if test="${(day + firstDayOfWeek - 1) % 7 == 0}">
                </tr><tr>
            </c:if>
        </c:forEach>
    </tr>
</table>

</body>
</html>
