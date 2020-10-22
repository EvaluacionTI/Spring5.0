<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<title>.....[Evaluacion Spring 5].....</title>
</head>
<body>
	<h2>Listar Proyeccion ArrayList</h2>
	Fecha del Sistema :<co:out value="${model.vFechaSistema}"></co:out>
	<hr>
	
	<form method="POST">
		<table>
			<thead>
				<tr><td>Id</td>
					<td>Categoria</td>
					<td>Clase</td>
					<td>Tipo producto</td>
					<td>Marca</td>
					<td>Modelo Presentacion</td>
					<td>Precio Venta</td>
				</tr>
			</thead>
			<tbody>
				<co:forEach items="${model.listSaldoAfiliados}" var="itemcic">
					<tr><td><co:out value="${itemcic.id}"/></td>
						<td><co:out value="${itemcic.categoria}"/></td>
						<td><co:out value="${itemcic.clase}"/></td>
						<td><co:out value="${itemcic.tipoProducto}"/></td>
						<td><co:out value="${itemcic.marca}"/></td>
						<td><co:out value="${itemcic.modeloPresentacion}"/></td>
						<td><co:out value="${itemcic.precioVenta}"/></td>
					</tr>
				</co:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>