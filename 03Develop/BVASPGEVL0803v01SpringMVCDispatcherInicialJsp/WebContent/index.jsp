

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>.....[Evaluacion Spring 5].....</title>
</head>
<body>
	<h5>Registro APX - HOST</h5>
	<div>
		Requerimiento: <br>
		<ol>
			<li>Crear una página dinámica</li>
			<li>Convertir a maven</li>
			<li>Crear un jsp en WebContent con el nombre de index.jsp</li>
			<li>Crear la carpeta view bajo WEB-INF</li>
			<li>En el pom adicionar los javax.servlet para ejecutar un jsp.
				para la versión 1.2 de jstl y 2.5 de servlet</li>
			<li>En el pom adicionar los jar que corresponden a Spring
				context y Spring MVC para la versión 5.0.8</li>
			<li>Configurar con el distpatcher en el archivo web.xml</li>
			<li>Copiar el jstl-1.2.jar a la carpeta lib bajo WEB-INF</li>
			<li>Copiar un log4j2.xml en resources de main/java</li>
			<li>JSP:<br>
					Crear una jsp para el registro de Tipo Plan y esta debe ubicarse en WEB-INF/view<br>
					El JSP debe recibir una fecha enviada por el controlador<br>
					En el JSP debe invocar a CrearTipoPlan.ea<br>
				<br>CONTROLADOR:<br>
					Crear una clase controladora para mapear CrearTipoPlan.ea con el jsp0101v01CrearTipoPlan.jsp<br> 
					Definir una variable para la fecha y enviarla al jsp<br>
			</li>
		</ol>

		<br> Problema identificado: <br>
		<ul>
			<li>GRAVE: Servlet [dispatcherServletEVL] in web application
				[/SpringMVCDispatcherConWebXml] threw load() exception
				java.lang.ClassNotFoundException: org.springframework.web.servlet</li>
		</ul>
		<br><br> Solución: <br>
		<ul>
			<li>properties of Project / Deployment Assembly / Clic add / Java Buil Path Entries / Maven Dependencies / Clic Finish</li>
		</ul>
	</div>
	<co:url value="/CrearTipoPlan.ea" var="messageUrl"></co:url>
	<a href="${messageUrl}">Clic enter</a>
</body>
</html>
