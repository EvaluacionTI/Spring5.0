<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=V">
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
			<li>La uri absoluta: http://java.sun.com/jsp/jstl/core no puede
				resolverse o en web.xml o el los archivos jar desplegados con esta
				aplicación</li>
		</ul>

		<br> Solución: <br>
		<ul>
			<li>Definir en el POM de maven los javax.servlet</li>
			<li>Copiar el archivo jar jstl-1.2 en WEB-INF/lib</li>
		</ul>


	</div>
	<co:url value="/view/jsp0101v01Mostrar.jsp" var="messageUrl"></co:url>
	<a href="${messageUrl}">Clic enter</a>
</body>
</html>