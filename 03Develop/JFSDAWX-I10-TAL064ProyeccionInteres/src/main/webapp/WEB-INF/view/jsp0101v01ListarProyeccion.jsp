<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<title>.....[Evaluacion Spring 5].....</title>
</head>
<body>
	<h2>Listar Proyeccion ArrayList</h2>
	Fecha del Sistema :<co:out value="${vFechaSistema}"></co:out>
	<hr>
	
	<form method="POST">
		<table>
			<thead>
				<tr><td>Id</td>
					<td>Cóigo Afiliado</td>
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