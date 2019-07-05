<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<form action="<%=request.getContextPath()%>/cidade/controller">
		<table border="1">
			<tr>
				<td colspan="2">Adiconar Cidade</td>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Criar"> <input type="reset" value="Limpar" /></td>
			</tr>
		</table>
	</form>
	<br>
	<a href="/jsp/cidade/inicio.jsp" target="self"><input
		type="submit" Value="Inicio"></a>
</body>
</html>
