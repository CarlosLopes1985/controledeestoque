package com.infogrupo.controleestoque.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String descricao;
	private String lote;
	private Integer quantidade;
	private Integer qtdCaixas;
	private Integer qtdItensCaixa;
	
	@JsonIgnore
	@OneToMany(mappedBy="produto")
	private List<EstoqueProdutos>itens = new ArrayList<EstoqueProdutos>();
	
	public Produto(Integer id, String nome, String descricao, String lote, Integer quantidade, Integer qtdCaixas,
			Integer qtdItensCaixa) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.lote = lote;
		this.quantidade = quantidade;
		this.qtdCaixas = qtdCaixas;
		this.qtdItensCaixa = qtdItensCaixa;
	}
	
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", lote=" + lote + ", quantidade="
				+ quantidade + ", qtdCaixas=" + qtdCaixas + ", qtdItensCaixa=" + qtdItensCaixa + "]";
	}


	public Produto() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getLote() {
		return lote;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public Integer getQtdCaixas() {
		return qtdCaixas;
	}
	public Integer getQtdItensCaixa() {
		return qtdItensCaixa;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public void setQtdCaixas(Integer qtdCaixas) {
		this.qtdCaixas = qtdCaixas;
	}
	public void setQtdItensCaixa(Integer qtdItensCaixa) {
		this.qtdItensCaixa = qtdItensCaixa;
	}

	public List<EstoqueProdutos> getItens() {
		return itens;
	}

	public void setItens(List<EstoqueProdutos> itens) {
		this.itens = itens;
	}
	
}
