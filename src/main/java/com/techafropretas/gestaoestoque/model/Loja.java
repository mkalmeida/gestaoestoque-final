package com.techafropretas.gestaoestoque.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Loja")
public class Loja {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		@Column (name="idLoja")
		private int idLoja;
		
		@Column (name="nome")
		private String nome;
		
		@Column (name="cnpj")
		private String cnpj;
		
		@Column (name="email")
		private String email;
		
		@Column (name="senha")
		private String senha;
		
		@OneToMany(mappedBy = "nomeProduto", cascade = CascadeType.ALL)
		private List <Produto> produto;
		
		public List<Produto> getProduto() {
			return produto;
		}

		public void setProduto(List<Produto> produto) {
			this.produto = produto;
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



