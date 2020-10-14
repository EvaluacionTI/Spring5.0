<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>[DAW] Desarrollo Aplicaciones Web</title>
</head>
<body>
	<h6>Listado general de Afiliado</h6>
	Fecha del sistema : <co:out value="${vFechaSistema}"></co:out>
	<hr>
	<form method="POST">
		<table>
			<thead>
				<tr><td>Id</td>
					<td>Codigo Afiliado</td>
					<td>Saldo Afiliado</td>
				</tr>
			</thead>
			<tbody>
				<co:forEach items="${model.listSaldoAfiliados}" var="itemcic">
					<tr><td><co:out value="${itemcic.id}"/></td>
						<td><co:out value="${itemcic.codigoAfiliado}"/></td>
						<td><co:out value="${itemcic.saldoCIC}"/></td>
					</tr>
				</co:forEach>
			</tbody>
		</table>
	</form>
	
</body>
</html>