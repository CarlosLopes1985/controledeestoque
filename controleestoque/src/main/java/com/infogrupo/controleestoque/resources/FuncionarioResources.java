
package com.infogrupo.controleestoque.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infogrupo.controleestoque.entity.Funcionario;
import com.infogrupo.controleestoque.service.FuncionarioService;

@RestController
@RequestMapping(value="/funcionario")
public class FuncionarioResources {

	@Autowired
	private FuncionarioService funcionarioService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Funcionario>> findAllFuncionario() {
		List<Funcionario> list = funcionarioService.findAll();

		return ResponseEntity.ok().body(list);
	}
}
