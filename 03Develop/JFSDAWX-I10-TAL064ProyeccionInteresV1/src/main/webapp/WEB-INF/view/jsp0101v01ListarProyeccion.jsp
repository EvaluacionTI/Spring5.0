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
					<td>Saldo Afiliado</td>
					<td>Plazo</td>
					<td>Interes completo</td>
					<td>Interes sin feriado</td>
					<td>Diferencia interes</td>
					<td>Saldo Final</td>
				</tr>
			</thead>
			<tbody>
				<co:forEach items="${model.listSaldoAfiliados}" var="itemcic">
					<tr><td><co:out value="${itemcic.oCESaldo.codigo}"/></td>
						<td><co:out value="${itemcic.oCESaldo.saldoCIC}"/></td>
						<td><co:out value="${itemcic.oCEFormula.plazo}"/></td>
						<td><co:out value="${itemcic.interesCompleto}"/></td>
						<td><co:out value="${itemcic.interesSinFeriado}"/></td>
						<td><co:out value="${itemcic.diferenciaInteres}"/></td>
						<td><co:out value="${itemcic.saldoFinal}"/></td>
					</tr>
				</co:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>