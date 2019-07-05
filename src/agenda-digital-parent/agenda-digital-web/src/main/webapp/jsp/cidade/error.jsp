<%@page
	import="com.everis.academia.java.agenda.digital.business.BusinessException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ERROR</title>
<style>
body {
	background-image:
		url("<%=request.getContextPath()%>/jsp/cidade/img/404.jpg");
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
</head>
<body>
	<h1 style="color: red; text-align: center; size: 32px;">WARNING</h1>

	<%
		Exception servletException = (Exception) request
				.getAttribute(RequestDispatcher.ERROR_EXCEPTION);
	%>
	<h2 style="color: red; text-align: center;">
		Mensagem:
		<%=servletException.getLocalizedMessage()%>
	</h2>
	<div align="center">
		<a href="<%=request.getContextPath()%>/jsp/cidade/inicio.jsp"
			target="self"><input type="submit" Value="Go Back Inicio"></a>
		<a href="<%=request.getContextPath()%>/jsp/cidade/read.jsp"
			target="self"><input type="submit" Value="Go Back Lista"></a>
		<a href="<%=request.getContextPath()%>/jsp/cidade/create.jsp"
			target="self"><input type="submit" Value="Go Back Create"></a>
		<a href="<%=request.getContextPath()%>/jsp/cidade/update.jsp"
			target="self"><input type="submit" Value="Go Back Update"></a>
	</div>
</body>
</html>