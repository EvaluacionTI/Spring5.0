<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
<head>
<title>.....[Evaluacion Spring 5].....</title>
</head>
<body>
	<h2>Desarrollo de Aplicaciones Web</h2>
	<hr>

	<!-- <co:url value="/view/jsp0101v01ListarProyeccion.jsp" var="messageUrl"></co:url> -->
	<co:url value="/listarProyeccion.ea" var="messageUrl" />
	<a href="${messageUrl}">Clic enter</a>
</body>
</html>