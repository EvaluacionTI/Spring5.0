
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>.....[Evaluacion Spring 5].....</title>
	</head>
	
	<body>
		<h6>Crear Tipo de Plan</h6>
		<hr>
		Fecha del Sistema : <co:out value="${vFechaSistema}"></co:out>
		<hr>
		<form method="POST">
		
			<table>
				<tr><td><label for="codigo">Código Tipo Plan :</label></td>
					<td><input id="codigo" type="text" name="txtCodigoTipoPlan"></td>
				</tr>
				<tr><td><label for="empresa">Código Empresa :</label> </td>
					<td><input id="empresa" type="text" name="txtCodigoEmpresa"></td>
				</tr>
				<tr><td><label for="idioma">Código Idioma :</label></td>
					<td><input id="idioma" type="text" name="txtCodigoIdioma"></td>
				</tr>
				<tr><td><label for="abreviatura">Abreviatura :</label></td>
					<td><input id="abreviatura" type="text" name="txtAbreviatura"></td>
				</tr>
				<tr><td><label for="descripcion">Descripcion :</label></td>
					<td><input id="descripcion" type="text" name="txtDescripcion"></td>
				</tr>
				<tr><td><label for="descripcion">Visualizar :</label></td>
					<td><input id="descripcion" type="text" name="txtDescripcion"></td>
				</tr>
				<tr><td><label for="descripcion">Actualizar :</label></td>
					<td><input id="descripcion" type="text" name="txtDescripcion"></td>
				</tr>
				<tr><td><label for="descripcion">Anular :</label></td>
					<td><input id="descripcion" type="text" name="txtDescripcion"></td>
				</tr>
				<tr><td><label for="descripcion">Eliminar :</label></td>
					<td><input id="descripcion" type="text" name="txtDescripcion"></td>
				</tr>
				<tr><td><label for="descripcion">Default :</label></td>
					<td><input id="descripcion" type="text" name="txtDescripcion"></td>
				</tr>
				<tr><td><label for="descripcion">Activo :</label></td>
					<td><input id="descripcion" type="text" name="txtDescripcion"></td>
				</tr>
				<tr><td><label for="grabar">Grabar</label></td>
					<td><input id="grabar" type="submit" ></td>
				</tr>
			</table>
		</form>
	</body>
</html>