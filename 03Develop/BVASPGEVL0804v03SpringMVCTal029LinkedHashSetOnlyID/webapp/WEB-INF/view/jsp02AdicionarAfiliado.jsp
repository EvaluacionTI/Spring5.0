<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>[DAW] Desarrollo Aplicaciones Web</title>
</head>
<body>
	<h6>Registro de Saldo Afiliado</h6>
	Fecha del sistema :
	<co:out value="${model.vFechaSistema}"></co:out>
	<hr>
	<form method="POST" action="/saveSaldo">
		<table>
			<tr>
				<td>Id</td>
				<td><input type="text" name="model.vAfiliado.id">
			</tr>
			<tr>
				<td>Codigo Afiliado</td>
				<td><input type="text" name="model.vAfiliado.codigoAfiliado">
			</tr>
			<tr>
				<td>Saldo Afiliado</td>
				<td><input type="text" name="model.vAfiliado.saldoCIC">
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Grabar">
			</tr>

		</table>
	</form>

</body>
</html>