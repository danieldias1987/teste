package com.everis.academia.java.agenda.digital.entity;

public class Telefone {

	private Integer codigo;
	private Byte numero;
	private PrestadorServico prestadorServico;

	public Telefone() {
		super();
	}

	public Telefone(Integer codigo) {
		this();
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Byte getNumero() {
		return numero;
	}

	public void setNumero(Byte numero) {
		this.numero = numero;
	}

	public PrestadorServico getPrestadorServico() {
		return prestadorServico;
	}

	public void setPrestadorServico(PrestadorServico prestadorServico) {
		this.prestadorServico = prestadorServico;
	}

}
