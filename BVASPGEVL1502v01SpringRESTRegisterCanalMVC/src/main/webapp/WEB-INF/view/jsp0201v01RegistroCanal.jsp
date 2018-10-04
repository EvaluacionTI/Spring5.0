<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../view/jsp0102v01TagSpring.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>.....[Evaluación Sprint REST - MVC].....</title>
	</head>
	<body>
		<h3>Registro de Canal</h3>
		
		<div id="idDivRegistroCanal">
			<sf:form id="idFormRegistroCanal" method="POST" action="save">
				<table>
					<tr><td>Id</td>
						<td><sf:input path="id"/></td>
					</tr>
					<tr><td>Código</td>
						<td><sf:input path="codigo"/></td>
					</tr>
					<tr><td>Abreviatura</td>
						<td><sf:input path="abreviatura"/></td>
					</tr>
					<tr><td>Descripción</td>
						<td><sf:input path="descripcion"/> </td>
					</tr>
					<tr><td colspan="2">
						<input type="submit" value="Grabar">
					</tr>
				</table>
			</sf:form>
		</div>
	</body>
</html>