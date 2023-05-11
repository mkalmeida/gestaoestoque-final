package com.techafropretas.gestaoestoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LojaController {

	//inicio
	@RequestMapping(value="", method=RequestMethod.GET)
	public @ResponseBody String inicio() {
		return "inicio";
	}
	//sobre
	@RequestMapping(value="/sobre", method=RequestMethod.GET)
	public @ResponseBody String sobre() {
		return "sobre";
	}
	
	//contato
	@RequestMapping(value="/contato", method=RequestMethod.GET)
	public @ResponseBody String contato() {
		return "contato";
	}
	
}
