package com.everis.academia.java.agenda.digital.entity;

import java.util.Date;
import java.util.Set;

public class PrestacaoServico {

	private Integer codigo;
	private Date data;
	private PrestadorServico prestador;
	private Set<ServicoPrestado> servicosPrestados;

	public PrestacaoServico() {
		super();
	}

	public PrestacaoServico(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}

	public Set<ServicoPrestado> getServicosPrestados() {
		return servicosPrestados;
	}

	public void setServicosPrestados(Set<ServicoPrestado> servicosPrestados) {
		this.servicosPrestados = servicosPrestados;
	}

}
