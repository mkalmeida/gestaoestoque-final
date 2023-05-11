package com.techafropretas.gestaoestoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

	//inicio
		@RequestMapping(value="", method=RequestMethod.GET)
		public @ResponseBody String inicio() {
			return "inicio prod";
		}
		//sobre
		@RequestMapping(value="/sobre", method=RequestMethod.GET)
		public @ResponseBody String sobre() {
			return "sobre prod";
		}
		
		//contato
		@RequestMapping(value="/contato", method=RequestMethod.GET)
		public @ResponseBody String contato() {
			return "contato prod";
		}
}
