<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<form method="post" action="myinfo">
	<input type="submit" value="post">
</form>

<form method="get" action="myinfo">
	<input type="submit" value="get">
</form>
</body>
</html>
