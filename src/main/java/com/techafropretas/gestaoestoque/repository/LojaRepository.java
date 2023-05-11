package com.techafropretas.gestaoestoque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techafropretas.gestaoestoque.model.Loja;

@Repository
public interface LojaRepository extends JpaRepository <Loja, Integer> {
	
	// listar todos os produtos
	List<Loja> findAll();
	
	//pesquiser por codigo
	Loja findById(int idLoja);
	
	//remover produto
	void delete(Loja loja);
	
	//cadastrar/alterar produto
	<LojaMod extends Loja> LojaMod save(LojaMod loja);
}
