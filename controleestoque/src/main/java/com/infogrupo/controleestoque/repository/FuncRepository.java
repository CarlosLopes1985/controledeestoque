package com.infogrupo.controleestoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infogrupo.controleestoque.entity.Funcionario;

@Repository
public interface FuncRepository extends JpaRepository<Funcionario, Integer> {
	
}
