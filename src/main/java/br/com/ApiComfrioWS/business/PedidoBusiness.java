package br.com.ApiComfrioWS.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ApiComfrioWS.dao.PedidoDAOImpl;
import br.com.ApiComfrioWS.model.ItensPedido;
import br.com.ApiComfrioWS.model.Pedido;

@Service
public class PedidoBusiness {

	@Autowired
	PedidoDAOImpl pedidoDAO;

	public Pedido findpedido() {

		List<Pedido>lspedido = new ArrayList<>();
		lspedido=pedidoDAO.findpedidobycod();
		List<ItensPedido>lsitens = new ArrayList<>();
		Pedido pedido = new Pedido();

		for(Pedido pedidofmt : lspedido) {

			pedido.setCodigopedido(pedidofmt.getCodigopedido());


			if(pedidofmt.getCodigopedido() !=null) {

				ItensPedido item = new ItensPedido();
				item.setCodproduto(pedidofmt.getItem().getCodproduto());
				item.setDescricaoproduto(pedidofmt.getItem().getDescricaoproduto());
				item.setQtdproduto(pedidofmt.getItem().getQtdproduto());
				item.setUnidadeproduto(pedidofmt.getItem().getUnidadeproduto());
				lsitens.add(item);
			}


		}

		pedido.setItens(lsitens);

		return pedido;
	}

}
