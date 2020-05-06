<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/JSP02Include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><fm:message key="title" /></title>
</head>
<body>
	<h1>
		<fm:message key="heading" />
	</h1>
	<p>
		<fm:message key="greeting" />
		<co:out value="${model.now}" />
	</p>
	<h3>Products</h3>
	<co:forEach items="${model.products}" var="prod">
		<co:out value="${prod.description}" />
		<i>$<co:out value="${prod.price}" /></i>
		<br>
		<br>
	</co:forEach>
</body>
</html>