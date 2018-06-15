<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Person List</title>
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
	<h1>Jstl: if</h1>
	<a href="${pageContext.request.contextPath}/">Home</a>
	<br />
	<br />
	<div>
		<table>
			<tr>
				<th>money:</th>
				<td>${salary.money}</td>
			</tr>
			<tr>
				<th>bonus:</th>
				<td>${salary.bonus}</td>
			</tr>
		</table>

	</div>
	<br />
	<div>
		<c:if test="${salary.money > 200}">
			<p>My salary is more than 200</p>
		</c:if>

		<c:if test="${salary.money < 200}">
			<p>My salary is less than 200</p>
		</c:if>

		<c:if test="${salary.money == 100}">
			<p>My salary is 100</p>
		</c:if>
	</div>
</body>

</html>