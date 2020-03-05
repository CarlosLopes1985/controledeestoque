package com.infogrupo.controleestoque.validation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.infogrupo.controleestoque.entity.EstoqueProdutos;
import com.infogrupo.controleestoque.entity.Produto;
import com.infogrupo.controleestoque.repository.ProdutoRepository;

public class ValidaEstoqueProduto {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Boolean validaRetiradaEntrada(EstoqueProdutos objDTO) {
		
		Optional<Produto> p = produtoRepository.findById(objDTO.getId());
		
		if(objDTO.getTipoOperacao() == 1
				&& objDTO.getQuantidade() > p.get().getQuantidade()) {
			
			return false;
		}
		return true;
	}
	
}
