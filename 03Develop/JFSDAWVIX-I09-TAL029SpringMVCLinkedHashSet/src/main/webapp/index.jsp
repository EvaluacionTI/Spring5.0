<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>[DAW] Desarrollo Aplicaciones Web</title>
</head>
<body>
	<h2>Analizando el Dispatcher</h2>
	<hr>
		Mostrar información por medio de LinkedHashset]<br>
		
	<co:url value="/listadoAfialiados.lns" var="mensajeUrl"/>
	<a href="${mensajeUrl}">Clic de acceso</a>

</body>
</html>
