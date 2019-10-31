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
		Configuración: <br>
		<ol>
			<li>Crear una proyect maven</li>
			<li>Modificar el POM para agregar las dependencias:
				javax.servlet / servlet-api / jstl
				taglibs
				spring-contexts
				spring-webmvc
			</li>
			<li>Crear la carpeta view bajo WEB-INF</li>
			<li>Crear el archivo jsp jsp0101v01CrearTipoPlan en WebContent o webapp bajo view</li>
			<li>Modificar el archivo web.xml para agregar el DispatcherServelet</li>
			<li>Definir la ubicación del servlet bajo WEB-INF</li>
			<li>Crear un bean mvc-servlet</li>
		</ol>
		<co:url value="/CrearTipoPlan.ea" var="messageUrl"></co:url>
	<a href="${messageUrl}">Clic enter</a>
	</body>
</html>
