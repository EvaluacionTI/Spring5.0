<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>[DAW] Desarrollo Aplicaciones Web</title>
	</head>
	<body>
		<h2>Exámen modulo III</h2>
		<hr>
		<co:url value="/listadoProducto.eur" var="productoUrl" />
		<a href="${productoUrl}">Listado de Productos</a>
		<br>
		<br>
		<co:url value="/listadoCliente.eur" var="clienteUrl" />
		<a href="${clienteUrl}">Listado de Clientes</a>
		<br>
		<br>
		<co:url value="/listadoCompraEfectuada.eur" var="compraUrl" />
		<a href="${compraUrl}">Listado Compras Efectuadas</a>
		<br>
		<br>
		<co:url value="/listadoUltimaCompra.eur" var="ultimaCompraUrl" />
		<a href="${ultimaCompraUrl}">Listado Ultima Compra</a>
		<br>
		<br>
		<co:url value="/listadoNoCompra.eur" var="ultimaNoCompraUrl" />
		<a href="${ultimaNoCompraUrl}">Listado no compra</a>
	</body>
</html>
