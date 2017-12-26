package br.com.ApiComfrioWS.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class ItensPedido implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	private Long id;
	private String codproduto;
	private String descricaoproduto;
	private int qtdproduto;
	private String unidadeproduto;


	//Getters and Setters

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodproduto() {
		return codproduto;
	}
	public void setCodproduto(String codproduto) {
		this.codproduto = codproduto;
	}
	public String getDescricaoproduto() {
		return descricaoproduto;
	}
	public void setDescricaoproduto(String descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}
	public int getQtdproduto() {
		return qtdproduto;
	}
	public void setQtdproduto(int qtdproduto) {
		this.qtdproduto = qtdproduto;
	}
	public String getUnidadeproduto() {
		return unidadeproduto;
	}
	public void setUnidadeproduto(String unidadeproduto) {
		this.unidadeproduto = unidadeproduto;
	}
}
