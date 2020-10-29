<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
	
	<title>[DAW] Desarrollo Aplicaciones Web</title>
</head>
<body>

	<h4 class="text-center">Visualizar de Afiliado</h4>
	Fecha del sistema :
	<co:out value="${model.vFechaSistema}"></co:out>
	<hr>

	<div class="container mt-4">
 	<div class="card border-info">
  	<div class="card-header bg-info text-white">
  		<a href="adicionarAfiliado.lhs" class="btn btn-success"><i class="glyphicon glyphicon-edit"></i>Adicionar Afiliado</a>
  	</div>
  	<div class="card-body">
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
  	</div>
	</div></div>
</body>
</html>