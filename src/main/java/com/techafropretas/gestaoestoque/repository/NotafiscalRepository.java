package com.techafropretas.gestaoestoque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techafropretas.gestaoestoque.model.Notafiscal;

@Repository
public interface NotafiscalRepository extends JpaRepository <Notafiscal, Integer> {
	
	// listar todos os produtos
	List <Notafiscal> findAll();
	
	//pesquiser por codigo
	Notafiscal findById(int nf);
	
	//remover produto
	void delete(Notafiscal notafiscal);
	
	//cadastrar/alterar produto
	<LojaMod extends Notafiscal> LojaMod save(LojaMod notafiscal);
}
