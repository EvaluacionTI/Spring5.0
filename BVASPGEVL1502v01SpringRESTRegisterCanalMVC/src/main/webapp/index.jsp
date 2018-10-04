<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>.....[Evaluación Sprint REST - MVC].....</title>
	</head> 
	<body>
		<c:url value="/showMessage.html" var="messageUrl" />
		<c:url value="/jsp0201v01RegistroCanal.jsp" var="addCanalUrl" />}
		<c:url value="/jsp0301v01ActualizarCanal.jsp" var="updateCanalUrl" />
		<c:url value="/jsp0401v01ListarCanal.jsp" var="listCanalUrl" />
		
		<a href="${messageUrl}">Click to enter</a>
		<a href="${addCanalUrl}">Registrar un Canal</a>
		<a href="${updateCanalUrl}">Modificar un Canal</a>
		<a href="${listCanalUrl}">Lista los canales</a>

	</body>
</html>
