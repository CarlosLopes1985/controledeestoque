package com.infogrupo.controleestoque.service;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogrupo.controleestoque.dto.EstoqueProdutoDTO;
import com.infogrupo.controleestoque.entity.EstoqueProdutos;
import com.infogrupo.controleestoque.entity.Funcionario;
import com.infogrupo.controleestoque.entity.Produto;
import com.infogrupo.controleestoque.repository.EstoqueProdutoRepository;

@Service
public class EstoqueProdutoService {

	@Autowired
	private EstoqueProdutoRepository estoqueProdutoRepository;
	
	public List<EstoqueProdutos> findAll() {
		
		return estoqueProdutoRepository.findAll();
	}

	public EstoqueProdutos fromDto(@Valid EstoqueProdutoDTO objDto) {
		
		Funcionario f = new Funcionario();
		f.setId(objDto.getIdFuncionario());
		
		Produto p = new Produto();
		p.setId(objDto.getIdProduto());
		
		EstoqueProdutos es = new EstoqueProdutos(null,new Date(),0,500,p,f);
		
		return es;
	}

	public EstoqueProdutos insert(EstoqueProdutos obj) {
		
		
		return estoqueProdutoRepository.save(obj);
	}

}
