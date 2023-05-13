package com.techafropretas.gestaoestoque.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Loja")
public class Loja {

	@Id
	@SequenceGenerator(name = "loja_sequence", 
						sequenceName = "loja_sequence",
						allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,
	generator = "loja_sequence")
	private int idLoja;
	private String nome;
	private String cnpj;
	private String email;
	private String senha;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List <Notafiscal> notafiscal;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Produto> Produto;
	
	public void setProduto(List<Produto> produto) {
		Produto = produto;
	}
	public List<Notafiscal> getNotafiscal() {
		return notafiscal;
	}
	public void setNotafiscal(List<Notafiscal> notafiscal) {
		this.notafiscal = notafiscal;
	}
	
	public int getIdLoja() {
		return idLoja;
	}
	public void setIdLoja(int idLoja) {
		this.idLoja = idLoja;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	
}