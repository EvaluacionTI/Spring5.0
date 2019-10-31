<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
	<head>
		<title>.....[Evaluacion Spring 5].....</title>
	</head>
	<body>
	<h5>Registro APX - HOST</h5>
	<div>
		Requerimiento: <br>
		<ol>
			<li>Crear una página dinámica</li>
			<li>Convertir a maven</li>
			<li>Crear un jsp en WebContent</li>
			<li>Crear la carpeta view bajo WEB-INF</li>
			<li>En el pom adicionar los javax.servlet para ejecutar un jsp.</li>
		</ol>

		<br> Problema identificado: <br>
		<br>
		<ul>
			<li>1. Crear una carpeta bajo webapp. La carpeta view cuando se usa servlet sin Spring</li>
			<li>2. La uri absoluta: http://java.sun.com/jsp/jstl/core tiene que cargar un TLD
			<li>3. Referir en el archivo web.xml las referencias de iniciación</li>
		</ul>

		<br> Solución: <br>
		<ul>
			<li>Definir en el POM de maven los javax.servlet</li>
			<li>Definir en el POM de maven los taglibs</li>
			<li>Copiar el archivo jar jstl-1.2 en WEB-INF/lib si se requiere</li>
		</ul>


	</div>
	<co:url value="/view/jsp0101v01Mostrar.jsp" var="messageUrl"></co:url>
	<a href="${messageUrl}">Clic enter</a>
	</body>
</html>
