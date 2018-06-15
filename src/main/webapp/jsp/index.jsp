<%@page session="false"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
	<h1>Test JSP jstl</h1>
	<h2>${message}</h2>

	<a href="${pageContext.request.contextPath}/persons"> jstl: List</a>
	<br />
	<a href="${pageContext.request.contextPath}/variable"> jstl: variable</a>
	<br />
	<a href="${pageContext.request.contextPath}/if"> jstl: if</a>
	<br />
	<a href="${pageContext.request.contextPath}/url"> jstl: url</a>
</body>

</html>