package com.infogrupo.controleestoque;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infogrupo.controleestoque.entity.EstoqueProdutos;
import com.infogrupo.controleestoque.entity.Funcionario;
import com.infogrupo.controleestoque.entity.Produto;
import com.infogrupo.controleestoque.repository.EstoqueProdutoRepository;
import com.infogrupo.controleestoque.repository.FuncRepository;
import com.infogrupo.controleestoque.repository.ProdutoRepository;

@SpringBootApplication
public class ControleestoqueApplication implements CommandLineRunner {

	@Autowired
	private FuncRepository funcionarioRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstoqueProdutoRepository estoqueProdutoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ControleestoqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Funcionario func = new Funcionario(null, "11792993706", "Carlos Lopes");
		Funcionario func2 = new Funcionario(null, "11792993707", "Roberto Carlos");
		
		Produto p1 = new Produto(null, "Prego", "sem", "12567898", 1000, 10, 100);
		Produto p2 = new Produto(null, "Martelo", "sem", "12567898", 1000, 10, 100);
		Produto p3 = new Produto(null, "Parafuso", "sem", "12567898", 1000, 10, 100);
		Produto p4 = new Produto(null, "Serra", "sem", "12567898", 1000, 10, 100);
		Produto p5 = new Produto(null, "Arruelas", "sem", "12567898", 1000, 10, 100);
		
		EstoqueProdutos est  = new EstoqueProdutos(null,new Date(11/11/2020),1,100,p1,func);
		EstoqueProdutos est2 = new EstoqueProdutos(null,new Date(07/10/2010), 0,500,p2,func2);
		
		funcionarioRepository.saveAll(Arrays.asList(func,func2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		estoqueProdutoRepository.saveAll(Arrays.asList(est,est2));
	}

}
