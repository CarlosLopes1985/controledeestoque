package com.infogrupo.controleestoque.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.infogrupo.controleestoque.dto.EstoqueProdutoDTO;
import com.infogrupo.controleestoque.entity.EstoqueProdutos;
import com.infogrupo.controleestoque.service.EstoqueProdutoService;

@RestController
@RequestMapping(value="estoqueproduto")
public class EstoqueProdutosResources {
	
	@Autowired
	private EstoqueProdutoService estoqueProdutoService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<EstoqueProdutos>> findAllEstoqueProdutos() {
		
		List<EstoqueProdutos> list = estoqueProdutoService.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody EstoqueProdutoDTO objDto) throws Exception{
		
		EstoqueProdutos obj = estoqueProdutoService.fromDto(objDto);
		
		obj = estoqueProdutoService.insert(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
}
