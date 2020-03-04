package com.infogrupo.controleestoque.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infogrupo.controleestoque.entity.Produto;
import com.infogrupo.controleestoque.service.ProdutoService;

@RestController
@RequestMapping(value="/produto")
public class ProdutoResources {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Produto>> findAllProduto() {
		List<Produto> list = produtoService.findAll();

		return ResponseEntity.ok().body(list);
	}
	
}
