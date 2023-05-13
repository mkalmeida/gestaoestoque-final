package com.techafropretas.gestaoestoque.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.techafropretas.gestaoestoque.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer> { 
		
	
	
		// listar todos os produtos
		List <Produto> findAll();
		
		//pesquiser por codigo
		Produto findById(int idProduto);
		
		//remover produto
		void deleteById(Integer idProduto);
		
		//cadastrar/alterar produto
		<LojaMod extends Produto> LojaMod save(LojaMod produto);

		//filtrar por validade
		List<Produto> findByValidadeContains(String validade);

		//vencendo 30 dias
		List<Produto> findByValidade(String validade);

		


}

/*
 * String[] validadeSeparada = Produto.validade.split("/"); LocalDate
 * validadeFormat = LocalDate.of(Integer.parseInt(validadeSeparada[2]),
 * Integer.parseInt(validadeSeparada[1]),
 * Integer.parseInt(validadeSeparada[0])); return validadeFormat;
 */





