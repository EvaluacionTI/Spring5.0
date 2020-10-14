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
		
	<co:url value="/adicionarAfiliado.lhs" var="adicionarUrl"/>
	<a href="${adicionarUrl}">Nuevo de Saldo de Afiliados</a>
	<br>
	<br>
	<co:url value="/visualizarAfiliados.lhs" var="visualizarUrl"/>
	<a href="${visualizarUrl}">Visualizar Saldo de Afiliados</a>	
	<br>
	<br>
	<co:url value="/listadoAfiliados.lhs" var="listadoUrl"/>
	<a href="${listadoUrl}">Lista general de Saldo de Afiliados</a>
	<br>
	<br>
</body>
</html>
