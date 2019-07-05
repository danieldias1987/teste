<%@page
	import="com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness"%>
<%@page
	import="com.everis.academia.java.agenda.digital.business.ICidadeBusiness"%>
<%@page import="com.everis.academia.java.agenda.digital.entity.*"%>
<%@page import="com.everis.academia.java.agenda.digital.dao.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<table border="1">
		<tr>
			<td colspan="5">Parametros Recebido</td>
		</tr>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th colspan="2">A��o</th>
		</tr>
		<%!private ICidadeBusiness dao = new CidadeBusiness();%>
		<%
			for (Cidade cidade : dao.read()) {
		%>
		<tr>
			<td><%=cidade.getCodigo()%></td>
			<td><%=cidade.getNome()%></td>
			<td><a href="update.jsp?codigo=<%=cidade.getCodigo()%>">Actualizar</a></td>
			<td><a
				href="<%=request.getContextPath()%>/cidade/delete/controller?codigo=<%=cidade.getCodigo()%>">Delete</a></td>
		</tr>
		<%
			}
		%>
	</table>
	<br>
	<a href="/jsp/cidade/create.jsp" target="self"><input type="submit"
		Value="Criar Cidade"></a>
	<a href="/jsp/cidade/inicio.jsp" target="self"><input type="submit"
		Value="Inicio"></a>
</body>
</html>

