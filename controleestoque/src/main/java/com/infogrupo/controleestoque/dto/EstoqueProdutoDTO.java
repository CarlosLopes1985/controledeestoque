package com.infogrupo.controleestoque.dto;

import java.util.Date;

public class EstoqueProdutoDTO {
	
	private Integer idFuncionario;
	
	private Integer idProduto;
	
	private Date dataRetiradaOuEntrada;
	
	private Integer tipoOperacao;

	private Integer quantidade;

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
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
}
