package com.infogrupo.controleestoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogrupo.controleestoque.entity.Produto;
import com.infogrupo.controleestoque.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto cadastrar(Produto produto) {
		
		return produtoRepository.save(produto);
	}

	public List<Produto> findAll() {
		
		return produtoRepository.findAll();
	}
}
