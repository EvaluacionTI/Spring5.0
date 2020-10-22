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
				<tr><td>Cliente</td>
					<td>Fecha de compra</td>
					<td>Producto</td>
					<td>Cantidad</td>
					<td>Precio venta</td>
					<td>Total venta</td>
				</tr>
			</thead>
			<tbody>
				<co:forEach items="${model.listSaldoAfiliados}" var="itemcic">
					<tr><td><co:out value="${itemcic.codigoCliente}"/></td>
						<td><co:out value="${itemcic.fechaCompra}"/></td>
						<td><co:out value="${itemcic.idProducto}"/></td>
						<td><co:out value="${itemcic.cantidad}"/></td>
						<td><co:out value="${itemcic.precioVenta}"/></td>
						<td><co:out value="${itemcic.totalVenta}"/></td>
					</tr>
				</co:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>