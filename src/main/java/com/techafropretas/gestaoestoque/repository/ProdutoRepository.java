package com.techafropretas.gestaoestoque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techafropretas.gestaoestoque.model.Produto;

@Repository
public interface ProdutoRepository {

	public interface NotafiscalRepository extends JpaRepository <Produto, Integer> {
		
		// listar todos os produtos
		List <Produto> findAll();
		
		//pesquiser por codigo
		Produto findById(int idProduto);
		
		//remover produto
		void delete(Produto produto);
		
		//cadastrar/alterar produto
		<LojaMod extends Produto> LojaMod save(LojaMod produto);
	}
}
