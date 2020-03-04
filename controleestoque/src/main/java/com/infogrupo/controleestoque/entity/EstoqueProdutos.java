package com.infogrupo.controleestoque.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EstoqueProdutos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataRetiradaOuEntrada;
	
	private Integer tipoOperacao;

	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name="produto_id")
	private Produto produto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="funcionario_id")
	private Funcionario funcionario;

	public Produto getProduto() {
		return produto;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public EstoqueProdutos() {
		super();
	}
	
	

	public EstoqueProdutos(Integer id, Date dataRetiradaOuEntrada, Integer tipoOperacao, Integer quantidade,
			Produto produto, Funcionario funcionario) {
		super();
		this.id = id;
		this.dataRetiradaOuEntrada = dataRetiradaOuEntrada;
		this.tipoOperacao = tipoOperacao;
		this.quantidade = quantidade;
		this.produto = produto;
		this.funcionario = funcionario;
	}

	public Date getDataRetiradaOuEntrada() {
		return dataRetiradaOuEntrada;
	}

	public void setDataRetiradaOuEntrada(Date dataRetiradaOuEntrada) {
		this.dataRetiradaOuEntrada = dataRetiradaOuEntrada;
	}

	public Integer getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(Integer tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
	
}
