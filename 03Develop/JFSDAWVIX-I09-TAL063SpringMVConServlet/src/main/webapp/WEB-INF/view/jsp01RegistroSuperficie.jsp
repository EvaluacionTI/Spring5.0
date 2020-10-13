<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>[DAW] Desarrollo Aplicaciones Web</title>
</head>
<body>
	<h6>Registro de Superficie</h6>
	Fecha del sistema : <co:out value="${vFechaSistema}"></co:out>
	<hr>
	<form method="POST">
		<table>
			<tr>
				<td><label for="altura">Altura en mts :</label></td>
				<td><input id="altura" type="text" name="txtAltura"></td>
			</tr>
			<tr>
				<td><label for="grabar">Grabar</label></td>
				<td><input id="grabar" type="submit"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>