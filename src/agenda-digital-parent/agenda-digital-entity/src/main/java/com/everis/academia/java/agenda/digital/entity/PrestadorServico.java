package com.everis.academia.java.agenda.digital.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.everis.academia.java.agenda.digital.enums.TipoLogradouro;

@Entity
@Table(name = "TB_PRESTADOR", schema = "public")
@SequenceGenerator(name = "SQ_PRESTADOR", sequenceName = "SQ_PRESTADOR", initialValue = 1, allocationSize = 1)
public class PrestadorServico {

	@Id
	@GeneratedValue(generator = "SQ_PRESTADOR", strategy = GenerationType.SEQUENCE)
	@Column(name = "COD_PRESTADOR")
	private Short codigo;

	@Column(name = "NAME_PRESTADOR", nullable = false)
	private String nome;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "COD_CIDADE", nullable = false)
	private Cidade cidade;

	@Column(name = "Bairro_PRESTADOR", nullable = false)
	private String bairro;

	@Column(name = "CEP_PRESTADOR", nullable = false)
	private String cep;

	@Transient
	private TipoLogradouro tipoLogradouro;

	@Column(name = "LOGRADOURO_PRESTADOR", nullable = false)
	private String logradouro;

	@Column(name = "COMPLEMENTO_PRESTADOR", nullable = false)
	private String complemento;// andar

	@Column(name = "NUM_PRESTADOR")
	private String numero;

	@Column(name = "EMAIL_PRESTADOR", unique = true, nullable = false)
	private String email;

	@Transient
	private Set<PrestacaoServico> prestacaoServicos;

	@Transient
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = TipoServico.class)
	@JoinTable(name = "TB_SERVICOSCREDENCIADOS", joinColumns = {
			@JoinColumn(name = "COD_PRESTADOR") }, inverseJoinColumns = { @JoinColumn(name = "COD_TIPOSERVICO") })
	private Set<TipoServico> servicosCredenciados;

	@Transient
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "prestadorServico", orphanRemoval = true)
	private Set<Telefone> telefones;

	public PrestadorServico() {
		super();
	}

	public PrestadorServico(Short codigo) {
		this();
		this.codigo = codigo;
	}

	public Short getCodigo() {
		return codigo;
	}

	public void setCodigo(Short codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<PrestacaoServico> getPrestacaoServicos() {
		return prestacaoServicos;
	}

	public void setPrestacaoServicos(Set<PrestacaoServico> prestacaoServicos) {
		this.prestacaoServicos = prestacaoServicos;
	}

	public Set<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Set<TipoServico> getServicosCredenciados() {
		return servicosCredenciados;
	}

	public void setServicosCredenciados(Set<TipoServico> servicosCredenciados) {
		this.servicosCredenciados = servicosCredenciados;
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
		PrestadorServico other = (PrestadorServico) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
