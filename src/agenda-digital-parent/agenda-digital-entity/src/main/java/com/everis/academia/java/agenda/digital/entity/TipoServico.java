package com.everis.academia.java.agenda.digital.entity;

public class TipoServico {

	private Short codigo;
	private String descricao;

	public TipoServico() {
		super();
	}

	public TipoServico(Short codigo) {
		this();
		this.codigo = codigo;
	}

	public TipoServico(Short codigo, String descricao) {
		this(codigo);
		this.descricao = descricao;
	}

	public Short getCodigo() {
		return codigo;
	}

	public void setCodigo(Short id) {
		this.codigo = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoServico other = (TipoServico) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
