package com.techafropretas.gestaoestoque.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Produto")
public class Produto {
	@Id
	@SequenceGenerator(name = "produto_sequence", sequenceName = "produto_sequence", allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "produto_sequence")
	private int idProduto;
	private int idLoja;
	private String nomeProduto;
	private int ean;
	private String lote;
	private int caixaria;
	private int quantidade;
	private float valorTotalProd;
	private float valorUnitario;
	private String validade;
	private int nf;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Notafiscal notafiscal;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Loja loja;

	
	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public void setNotafiscal(Notafiscal notafiscal) {
		this.notafiscal = notafiscal;
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

	public int getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(int idLoja) {
		this.idLoja = idLoja;
	}

	public int getNf() {
		return nf;
	}

	public void setNf(int nf) {
		this.nf = nf;
	}

	
	
}