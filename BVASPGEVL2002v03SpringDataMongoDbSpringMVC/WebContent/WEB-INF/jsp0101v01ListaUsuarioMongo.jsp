<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="pe.etg.bbva.evalua.spring5.entidad.CEUsuario" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>.....[Spring 5.0.5].....</title>
	</head>
	<body>
		<%
			List<CEUsuario> oListUsuario = (List<CEUsuario>) request.getAttribute("vUsuario");
			for (CEUsuario oFila:oListUsuario){
				pageContext.setAttribute("vFirstName", oFila.getFirtname());
		%>
		<div>${vFirstName}</div>
		<%	} %>
	</body>
</html>