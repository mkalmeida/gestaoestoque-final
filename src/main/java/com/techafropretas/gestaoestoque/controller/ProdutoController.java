package com.techafropretas.gestaoestoque.controller;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping(value="/cadastraproduto", method=RequestMethod.POST)
	public @ResponseBody Produto cadastrarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	//filtrar produtos
		@RequestMapping(value="/filtra/{id}", method=RequestMethod.GET)
		public @ResponseBody Optional<Produto> getById(@PathVariable("id") Integer idProduto) {
			return produtoRepository.findById(idProduto);
		}
		
	//filtrar produtos por data de validade - STRING
		@RequestMapping(value="/filtravalidade", method=RequestMethod.GET)
		public List<Produto> filtrarString(@RequestParam("validade") String validade){
			return this.produtoRepository.findByValidadeContains(validade)
					.stream()
					.collect(Collectors.toList());
		}

		
		//altera produtos
		@RequestMapping(value="/altera", method=RequestMethod.PUT)
		public @ResponseBody Produto altera(@RequestBody Produto produto) {
			return produtoRepository.save(produto);
		}
		
		//delete produtos
		@DeleteMapping("/deleta/{id}")
		public ResponseEntity<Produto> exluir(@PathVariable("id") Integer idProduto) {
		    produtoRepository.deleteById(idProduto);
			return null;

		}
		
		
		/*altera produtos
		@RequestMapping(value="/delete/{idProduto}", method=RequestMethod.DELETE)
		public @ResponseBody void remove(@PathVariable("idProduto") Integer idProduto) {
			Optional<Produto> produto = getById(idProduto);
			this.produtoRepository.delete(produto);
		}*/
		
		
		/*LocalDate now = LocalDate.now();
		String[] ValidadeSeparada = prod1.getValidade().split("/");
		LocalDate ValidadeFormat = LocalDate.of(Integer.parseInt(ValidadeSeparada[2]), 
		Integer.parseInt(ValidadeSeparada[1]), Integer.parseInt(ValidadeSeparada[0]));
	
		long days = ValidadeFormat.until(now, ChronoUnit.MONTHS);*/
		
		/*
		 * //filtrar produtos menos 30 dias
		 * 
		 * @RequestMapping(value="/vencendo", method=RequestMethod.GET) public
		 * List<Produto> filterVencendo(){ DateTimeFormatter formatter =
		 * DateTimeFormatter.ofPattern("dd/MM/yyyy"); LocalDate date =
		 * LocalDate.parse(Prod.getValidade(), formatter); LocalDate hoje =
		 * LocalDate.now(); String dateString = date.toString(); // long daysBetween =
		 * ChronoUnit.DAYS.between(hoje, date); return
		 * this.produtoRepository.findByValidade("12/10/2025"); }
		 */
		

		
}


