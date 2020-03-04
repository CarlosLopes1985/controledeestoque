package com.infogrupo.controleestoque.enums;

public enum TypeOperacao {
	RETIRADA(1, "Retirada"),
	ENTRADA(2,"Entrada");
	
	private Integer cod;
	private String descricao;
	
	private TypeOperacao(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public Integer getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TypeOperacao toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(TypeOperacao x : TypeOperacao.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id: Inválido: "+cod);
	}
	
	
}
