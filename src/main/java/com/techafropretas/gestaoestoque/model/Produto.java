package com.techafropretas.gestaoestoque.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idProduto;
	
	@Column (name="nomeProduto")
	private String nomeProduto;
	
	@Column (name="ean")
	private int ean;
	
	@Column (name="lote")
	private String lote;
	
	@Column (name="caixaria")
	private int caixaria;
	
	@Column (name="quantidade")
	private int quantidade;
	
	@Column (name="valorTotalProd")
	private float valorTotalProd;
	
	@Column (name="valorUnitario")
	private float valorUnitario;
	
	@Column (name="validade")
	private String validade;
	
	@ManyToOne
	@JoinColumn(name="LojaIdLoja")
	public Loja loja;
	
	@ManyToOne
	@JoinColumn(name="NotafiscalNf")
	public Notafiscal notafiscal;

	/*Contrutor vazio*/
	public Produto() {
	}
	
	/*Contrutor sem o atributo ID*/
	public Produto(String nomeProduto, int ean, String lote, int caixaria, int quantidade,
			float valorTotalProd, float valorUnitario, String validade) {
		this.nomeProduto = nomeProduto;
		this.ean = ean;
		this.lote = lote;
		this.caixaria = caixaria;
		this.quantidade = quantidade;
		this.valorTotalProd = valorTotalProd;
		this.valorUnitario = valorUnitario;
		this.validade = validade;
	}

	/*Contrutor com todos os atributos*/
	public Produto(int idProduto, String nomeProduto, int ean, String lote, int caixaria, int quantidade,
			float valorTotalProd, float valorUnitario, String validade) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.ean = ean;
		this.lote = lote;
		this.caixaria = caixaria;
		this.quantidade = quantidade;
		this.valorTotalProd = valorTotalProd;
		this.valorUnitario = valorUnitario;
		this.validade = validade;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}


	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getEan() {
		return ean;
	}

	public void setEan(int ean) {
		this.ean = ean;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public int getCaixaria() {
		return caixaria;
	}

	public void setCaixaria(int caixaria) {
		this.caixaria = caixaria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorTotalProd() {
		return valorTotalProd;
	}

	public void setValorTotalProd(float valorTotalProd) {
		this.valorTotalProd = valorTotalProd;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public Notafiscal getNotafiscal() {
		return notafiscal;
	}

	public void setNotafiscal(Notafiscal notafiscal) {
		this.notafiscal = notafiscal;
	}	

}
