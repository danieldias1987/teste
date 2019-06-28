package com.everis.academia.java.agenda.digital.entity;

public class Cidade {

	private Integer codigo;
	private String nome;

	public Cidade() {
		super();
	}

	public Cidade(Integer codigo) {

		this();
		this.codigo = codigo;
	}

	public Cidade(Integer codigo, String nome) {
		this(codigo);
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
