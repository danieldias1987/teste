package com.everis.academia.java.agenda.digital.entity;

import java.util.Set;

import com.everis.academia.java.agenda.digital.enu.TipoLogradouro;

public class PrestadorServico {

	private Integer codigo;
	private String nome;
	private Cidade cidade;
	private String bairro;
	private String cep;
	private TipoLogradouro tipoLogradouro;
	private String logradouro;
	private String complemento;// andar
	private String numero;
	private String email;
	private Set<PrestacaoServico> prestacaoServicos;
	private Set<TipoServico> servicosCredenciados;
	private Set<Telefone> telefones;

	public PrestadorServico() {
		super();
	}

	public PrestadorServico(Integer codigo) {
		this();
		this.codigo = codigo;
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

}
