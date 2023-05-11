package com.techafropretas.gestaoestoque.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Notafiscal")
public class Notafiscal {
	
	@Id
	@Column (name="nf")
	private int nf;
	
	@Column (name="fornecedor")
	private String fornecedor;
	
	@Column (name="dataNF")
	private String dataNF;
	
	@Column (name="valorTotalNF")
	private float valorTotalNF;
	
	@OneToMany(mappedBy = "nomeProduto", cascade = CascadeType.ALL)
	private List <Produto> produto;
	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public int getNf() {
		return nf;
	}

	public void setNf(int nf) {
		this.nf = nf;
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
	
	
}
