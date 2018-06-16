<%@page session="false"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
	<h1> JSP: include </h1>

	<div style="background-color: green;">
	      <jsp:include page= "${pageContext.request.contextPath}/include"/>
	</div>
</body>

</html>