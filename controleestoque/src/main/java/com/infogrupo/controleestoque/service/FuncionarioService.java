package com.infogrupo.controleestoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogrupo.controleestoque.entity.Funcionario;
import com.infogrupo.controleestoque.repository.FuncRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncRepository funcionarioRepository;
	
	public Funcionario cadastrar(Funcionario funcionario) {
		
		return funcionarioRepository.save(funcionario);
	}

	public List<Funcionario> findAll() {
		
		return funcionarioRepository.findAll();
	}
}
