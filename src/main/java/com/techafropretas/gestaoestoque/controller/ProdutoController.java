package com.techafropretas.gestaoestoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techafropretas.gestaoestoque.model.Produto;
import com.techafropretas.gestaoestoque.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	//Acoes
	@Autowired
	private ProdutoRepository produtoRepository;
	
	//inicio
	@RequestMapping(value="", method=RequestMethod.GET)
	public @ResponseBody List<Produto> listar() {
		return produtoRepository.findAll();
	}

	//cadastrar loja
	@RequestMapping(value="/post", method=RequestMethod.POST)
	public @ResponseBody Produto cadastrarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
}

