<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spg" uri="http://www.springframework.org/tags" %>
<html>
	<head>
		<title>.....[Evaluacion Spring 5].....</title>
	</head>
	<body>
		<h2>Iniciar Spel Expression</h2>
		Fecha del Sistema :<co:out value="${vFechaSistema}"></co:out>
		<hr/>
		
		<spg:eval expression="@servicioImpuestos.retencion"></spg:eval>
		<spg:eval expression="@impuestos.igv"></spg:eval>
	
	</body>
</html>