<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>[EVL] - Modulo Inventario</title>
</head>
<body>
	<h1>Modulo de Inventario en Spring 5</h1>
	<hr>
	<h2>He sido llamado desde un controlador</h2>
	<br>
	<div>
		Procedimiento
		<ul>
			<li>Convertir el proyecto Dynamic Proyect a maven</li>
			<li>Agregar las dependencias de Spring context y webmvc</li>
			<li>Agregar las dependencias de pruebas (Spring Test y Junit)</li>
			<li>Agregar las dependencias de log (slf4j)</li>
			<li>Modificar el file web.xml<br> Incluir el servlet
				referido al DispatcherServlet<br> Incluir la forma de llamar a
				los recursos en la url, bajo el sufijo *.eias
			</li>
			<li>Incluir el file servlet.xml incluyendo el nombre del bean de
				llamado asociado a la clase controladora</li>
			<li>Implementar la clase controladora para referir al
				ModelAndView</li>
		</ul>
		<br>

	</div>
</body>
</html>