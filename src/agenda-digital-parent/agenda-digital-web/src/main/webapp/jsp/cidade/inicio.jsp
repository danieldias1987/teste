<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/navbar.css">
<link rel="stylesheet" href="css/footer.css">
<meta charset="ISO-8859-1">
<title>Agenda Digital Web</title>
<style type="text/css">
body {
	background-image: url("img/agendadigital.jpg");
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
</head>
<body>
	<div class="navbar">
		<a href="<%=request.getContextPath()%>/jsp/cidade/inicio.jsp">Home</a>
		<a href="<%=request.getContextPath()%>/jsp/cidade/create.jsp">Create</a>
		<a href="<%=request.getContextPath()%>/jsp/cidade/read.jsp">List</a>
	</div>
	<div class="footer">
		<a href="https://pt-pt.facebook.com/portugal.everis/"
			class="fa fa-facebook"></a> <a
			href="https://www.instagram.com/everisgroup/" class="fa fa-instagram"></a>
	</div>
</body>
</html>