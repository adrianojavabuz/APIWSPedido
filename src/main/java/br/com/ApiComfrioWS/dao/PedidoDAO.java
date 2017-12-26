package br.com.ApiComfrioWS.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ApiComfrioWS.model.Pedido;

@Service
public interface PedidoDAO {

	public List<Pedido>findpedidos();
	public List<Pedido> findpedidobycod();

}
