<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    section {width: 700px; margin: auto; text-align: center;}
    table {width: 100%; border-collapse: collapse; margin: auto;}
    th, td {border-top: 1px solid black; border-bottom: 1px solid black; padding: 8px;}
    th {border-top: 3px solid black; border-bottom: 3px solid black;}
    tr:last-child td {border-bottom: 3px solid black;}
    .title {text-align: left;}
    .btn {text-align: right; margin: 20px 0;}
    .btn a {text-decoration: none; color: white; width: 200px; height: 30px;
            background: black; display: inline-block; line-height: 30px; text-align: center;
            border-radius: 5px;}
    table a {text-decoration: none; color: black;}
    table a:visited {color: red;}
    tr:hover {background: gray;}
</style>
</head>
<body>
    <section>
        <table>
            <tr>
                <th>글번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>조회수</th>
                <th>작성일</th>
            </tr>
            <c:forEach var="list" items="${list}">
            <tr>
                <td>${list.id}</td>
                <td class="title"><a href="readnum?id=${list.id}">${list.title}</a></td>
                <td>${list.name}</td>
                <td>${list.readnum}</td>
                <td>${list.writeday}</td>
            </tr>
            </c:forEach>
        </table>
        <div class="btn">
            <a href="write">글쓰기</a>
        </div>
    </section>
</body>
</html>
