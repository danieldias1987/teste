<%@page import="com.everis.academia.java.agenda.digital.entity.Cidade"%>
<%@page import="com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness"%>
<%@page import="com.everis.academia.java.agenda.digital.business.ICidadeBusiness"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<form action="<%=request.getContextPath()%>/cidade/update/controller">
		<table border="1">
			<tr>
				<td colspan="2">Actualizar</td>
			</tr>
			<%!private ICidadeBusiness cidadebusiness = new CidadeBusiness();%>
			<%
			Integer codigo = Integer.valueOf(request.getParameter("codigo"));

			Cidade cidade = cidadebusiness.retorna(codigo);%>
			<tr>
				<td>Codigo:</td>
				<td><input type="text" name="codigo" value="<%=cidade.getCodigo() %>" /></td>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" value="<%=cidade.getNome() %>" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Update"><a href="read.jsp"></a></td>
			</tr>
		</table>
	</form>
	<br>
	<a href="<%=request.getContextPath()%>/jsp/cidade/inicio.jsp" target="self"><input type="submit"
		Value="Inicio"></a>
</body>
</html>