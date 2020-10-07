
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>.....[Evaluacion Spring 5].....</title>
	</head>
	
	<body>
		<h6>Mostrar Pollo</h6>
		<hr>
		Fecha del Sistema : <co:out value="${vFechaSistema}"></co:out>
		<hr>
		<form method="POST">
		
			<table>
				<tr><td><label for="codigo">Código Galpon :</label></td>
					<td><input id="codigo" type="text" name="txtCodigoTipoPlan"></td>
				</tr>
				<tr><td><label for="empresa">Ubicacion Galpon :</label> </td>
					<td><input id="empresa" type="text" name="txtCodigoEmpresa"></td>
				</tr>
				<tr><td><label for="idioma">Largo Galpon :</label></td>
					<td><input id="idioma" type="text" name="txtCodigoIdioma"></td>
				</tr>
				<tr><td><label for="abreviatura">Ancho Galpon :</label></td>
					<td><input id="abreviatura" type="text" name="txtAbreviatura"></td>
				</tr>
				<tr><td><label for="descripcion">Altura Galpon :</label></td>
					<td><input id="descripcion" type="text" name="txtDescripcion"></td>
				</tr>
				<tr><td><label for="descripcion">No Pollos :</label></td>
					<td><input id="descripcion" type="text" name="txtDescripcion"></td>
				</tr>
				<tr><td><label for="grabar">Grabar</label></td>
					<td><input id="grabar" type="submit" ></td>
				</tr>
			</table>
		</form>
	</body>
</html>