<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<title>[DAW] Desarrollo Aplicaciones Web</title>
</head>
<body>
	<hr />
	<div class="container mt-4 col-lg-4">
		<div class="card border-info">
			<div class="card-header bg-info">
				<h6>Registro de Saldo Afiliado</h6>
				Fecha del sistema :
				<co:out value="${model.vFechaSistema}">/</co:out>
				<co:out value="${model.vAfiliado.id}"></co:out>
			</div>
			<div class="card-body">
			
				<form method="POST" action="saveSaldo.lhs">
					<table>
						<tr>
							<td><label>Id</label></td>
							<td><input type="text" name="model.vAfiliado.id" class="form-control">
						</tr>
						<tr>
							<td><label>Código Afiliado : </label></td>
							<td><input type="text" name="model.vAfiliado.codigoAfiliado" class="form-control">
						</tr>
						<tr>
							<td><label>Saldo Afiliado</label></td>
							<td><input type="text" name="model.vAfiliado.saldoCIC" class="form-control">
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" value="Grabar" class="btn btn-success">
						</tr>
						<a href="index.lhs">Retornar</a>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>