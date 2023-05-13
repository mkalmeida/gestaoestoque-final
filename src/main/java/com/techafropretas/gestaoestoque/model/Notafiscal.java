package com.techafropretas.gestaoestoque.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Notafiscal")
public class Notafiscal {
	
	@Id
	@Column (name="nf")
	private int nf;
	
	@Column (name="idLoja")
	private int idLoja;
	
	@Column (name="fornecedor")
	private String fornecedor;
	
	@Column (name="dataNF")
	private String dataNF;
	
	@Column (name="valorTotalNF")
	private float valorTotalNF;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Produto> produto;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Loja loja;
	

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDataNF() {
		return dataNF;
	}

	public void setDataNF(String dataNF) {
		this.dataNF = dataNF;
	}

	public float getValorTotalNF() {
		return valorTotalNF;
	}

	public void setValorTotalNF(float valorTotalNF) {
		this.valorTotalNF = valorTotalNF;
	}


	public int getNf() {
		return nf;
	}

	public void setNf(int nf) {
		this.nf = nf;
	}

	public int getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(int idLoja) {
		this.idLoja = idLoja;
	}




	
	
}