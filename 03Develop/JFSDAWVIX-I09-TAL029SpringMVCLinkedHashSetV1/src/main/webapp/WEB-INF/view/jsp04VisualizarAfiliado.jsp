<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<link rel="stylesheet"href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<title>[DAW] Desarrollo Aplicaciones Web</title>
</head>
<body>
	<div class="container-fluid">
 	<div class="row-fluid">
  	<div class="col-md-6">
	<h4 class="text-center">Visualizar de Afiliado</h4>
	Fecha del sistema :
	<co:out value="${model.vFechaSistema}"></co:out>
	<hr>
	<a href="adicionarAfiliado.lhs" class="btn btn-success"><i class="glyphicon glyphicon-edit"></i>Adicionar Afiliado</a>
	<br>
	<br>
	<table class="table table-bordered table-striped">
		<thead>
			<tr>
				<td>Id</td>
				<td>Codigo Afiliado</td>
				<td>Saldo Afiliado</td>
				<td>Editar</td>
				<td>Eliminar</td>
			</tr>
		</thead>
		<tbody>
			<co:forEach items="${model.listSaldoAfiliados}" var="itemcic">
				<tr>
					<td><co:out value="${itemcic.id}" /></td>
					<td><co:out value="${itemcic.codigoAfiliado}" /></td>
					<td><co:out value="${itemcic.saldoCIC}" /></td>
					<td><a href="editarsaldo/${itemcic.id}" class="btn btn-info btn-xs"><i class="glyphicon glyphicon-check"></i>Editar</a></td>
					<td><a href="eliminarSaldo/${itemcic.id}" class="btn btn-danger btn-xs"><i class="glyphicon glyphicon-trash"></i>Eliminar</a></td>
				</tr>
			</co:forEach>
		</tbody>
	</table>
	<br>

	</div></div></div>
</body>
</html>