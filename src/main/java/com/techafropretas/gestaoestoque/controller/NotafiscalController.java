package com.techafropretas.gestaoestoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.techafropretas.gestaoestoque.model.Notafiscal;
import com.techafropretas.gestaoestoque.repository.NotafiscalRepository;


@RestController
@RequestMapping("/notafiscal")
public class NotafiscalController {

	//Acoes
		@Autowired
		private NotafiscalRepository notafiscalRepository;
		
		//inicio
		@RequestMapping(value="", method=RequestMethod.GET)
		public @ResponseBody List<Notafiscal> listar() {
			return notafiscalRepository.findAll();
		}

		//cadastrar nota
		@RequestMapping(value="/inserenota", method=RequestMethod.POST)
		public @ResponseBody Notafiscal cadastrarNota(@RequestBody Notafiscal notafiscal) {
			return notafiscalRepository.save(notafiscal);
		}
		
}

