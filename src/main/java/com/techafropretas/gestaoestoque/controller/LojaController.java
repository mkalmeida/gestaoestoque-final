package com.techafropretas.gestaoestoque.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techafropretas.gestaoestoque.model.Loja;

import com.techafropretas.gestaoestoque.repository.LojaRepository;



@RestController
@RequestMapping("/loja")
public class LojaController {

	//Acoes
	@Autowired
	private LojaRepository lojaRepository;
	

	
	//inicio
	@RequestMapping(value="", method=RequestMethod.GET)
	public @ResponseBody List<Loja> listar() {
		return lojaRepository.findAll();
	}

	//cadastrar loja
	@RequestMapping(value="/cadastra", method=RequestMethod.POST)
	public @ResponseBody Loja cadastrarLoja(@RequestBody Loja loja) {
		return lojaRepository.save(loja);
	}
	
	//filtrar loja
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public @ResponseBody Optional<Loja> getById(@PathVariable("id") Integer idLoja) {
		return lojaRepository.findById(idLoja);
		
	}
	
}
