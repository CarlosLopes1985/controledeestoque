package com.infogrupo.controleestoque.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String cpf;
	private String  nome;
	
	@JsonIgnore
	@OneToMany(mappedBy="funcionario")
	private Set<EstoqueProdutos>itens = new HashSet<EstoqueProdutos>();
	
	public Funcionario() {
		super();
	}

	public Funcionario(Integer id, String cpf, String nome) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", cpf=" + cpf + ", nome=" + nome + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<EstoqueProdutos> getItens() {
		return itens;
	}

	public void setItens(Set<EstoqueProdutos> itens) {
		this.itens = itens;
	}
	
}
