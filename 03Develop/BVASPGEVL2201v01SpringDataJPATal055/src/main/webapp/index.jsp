<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
<head>
<title>.....[Evaluacion Spring 5].....</title>
</head>
<body>
	<h2>Evaluación de Spring v/5.0.8</h2>
	<hr>
	Configuración:
	<br>
	<ol>
		<li>Crear una proyect maven</li>
		<li>Modificar el POM para agregar las dependencias: javax.servlet
			servlet-api jstl  spring-contexts spring-webmvc</li>
		<li>Crear las carpeta bajo WEB-INF: view </li>
		<li>Crear el archivo jsp en la carpeta view:
			jsp0101v01ListarAfiliado.jsp</li>
		<li>Considerar el Servlet version3.0+</li>
		<li>Crear un bean al controller en el archivo
			linkedHashSet-servlet.xml</li>
	</ol>

	<!-- <co:url value="/view/jsp0101v01ListarAfiliado.jsp" var="messageUrl"></co:url> -->
	<co:url value="/listarAfiliados.ea" var="messageUrl" />
	<a href="${messageUrl}">Clic enter</a>
</body>
</html>