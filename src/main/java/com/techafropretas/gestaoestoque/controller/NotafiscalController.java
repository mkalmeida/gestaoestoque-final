package com.techafropretas.gestaoestoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/nota")
public class NotafiscalController {

	//inicio
	@RequestMapping(value="", method=RequestMethod.GET)
	public @ResponseBody String inicio() {
		return "inicio nota";
	}
	//sobre
	@RequestMapping(value="/sobre", method=RequestMethod.GET)
	public @ResponseBody String sobre() {
		return "sobre nota";
	}
	
	//contato
	@RequestMapping(value="/contato", method=RequestMethod.GET)
	public @ResponseBody String contato() {
		return "contato nota";
	}
	
}

