package br.com.ApiComfrioWS.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Pedido implements Serializable{

	/**
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */

	private Long id;
	private String codigopedido;

	private List<ItensPedido> itens;
	private int bloqued;
	@JsonIgnore()
	private ItensPedido item;



	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<ItensPedido> getItens() {
		return itens;
	}
	public void setItens(List<ItensPedido> itens) {
		this.itens = itens;
	}
	public int getBloqued() {
		return bloqued;
	}
	public void setBloqued(int bloqued) {
		this.bloqued = bloqued;
	}
	public ItensPedido getItem() {
		return item;
	}
	public void setItem(ItensPedido item) {
		this.item = item;
	}
	public String getCodigopedido() {
		return codigopedido;
	}
	public void setCodigopedido(String codigopedido) {
		this.codigopedido = codigopedido;
	}


}
