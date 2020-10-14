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
	<h6>Actualizar Saldo Afiliado</h6>
	Fecha del sistema :
	<co:out value="${vFechaSistema}"></co:out>
	<hr>
	<form method="POST" action="editsave">
		<table>
			<tr>
				<td>Id</td>
				<td><input type="text" name="vId">
			</tr>
			<tr>
				<td>Codigo Afiliado</td>
				<td><input type="text" name="vCodigo">
			</tr>
			<tr>
				<td>Saldo Afiliado</td>
				<td><input type="text" name="vSaldo">
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Edit Save">
			</tr>

		</table>
	</form>

</body>
</html>