package com.infogrupo.controleestoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infogrupo.controleestoque.entity.EstoqueProdutos;

@Repository
public interface EstoqueProdutoRepository extends JpaRepository<EstoqueProdutos, Integer> {

}
