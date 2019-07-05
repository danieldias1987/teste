<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/navbar.css">
<link rel="stylesheet" href="css/footer.css">
<!-- <link rel="stylesheet" href="css/table.css"> -->
<meta charset="ISO-8859-1">
<title>Agenda Digital Web</title>
<style type="text/css">
body {
	background-color: captiontext;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<div class="navbar">
		<a href="<%=request.getContextPath()%>/jsp/cidade/inicio.jsp">Home</a>
		<a href="<%=request.getContextPath()%>/jsp/cidade/create.jsp">Create</a>
		<a href="<%=request.getContextPath()%>/jsp/cidade/read.jsp">List</a>
	</div>
	<br>
	<br>
	<br>
	<div class="form">
	<form action="<%=request.getContextPath()%>/cidade/controller">
		<table border="1" style="background-color: black;">
			<tr style="background-color: green;">
				<th colspan="2" style="color: white;">Adiconar Cidade</th>
			</tr>
			<tr style="background-color: green;">
				<td style="color: white:">Nome:</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr style="background-color: green;">
				<td colspan="2" align="center"><input type="submit"
					value="Criar"> <input type="reset" value="Limpar" /></td>
			</tr>
		</table>
	</form>
	</div>
	<br>
	<a href="<%=request.getContextPath()%>/jsp/cidade/inicio.jsp"
		target="self"><input type="submit" Value="Inicio"></a>
</body>
</html>
