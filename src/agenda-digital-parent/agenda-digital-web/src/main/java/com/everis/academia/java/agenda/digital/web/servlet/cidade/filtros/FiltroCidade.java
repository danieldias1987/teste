package com.everis.academia.java.agenda.digital.web.servlet.cidade.filtros;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "filtro", urlPatterns = "/*") // a barra filtra tudo

public class FiltroCidade implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		Map<String, String[]> chamadas = request.getParameterMap();

		for (java.util.Map.Entry<String, String[]> parametro : chamadas.entrySet()) {

			parametro.getKey();
			parametro.getValue();

			System.out.println(parametro.getKey() + "--------------------" + Arrays.toString(parametro.getValue()));

		}

		chain.doFilter(request, response);// para rodar a app

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
