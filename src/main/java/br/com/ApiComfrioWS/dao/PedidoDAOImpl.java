package br.com.ApiComfrioWS.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import br.com.ApiComfrioWS.model.ItensPedido;
import br.com.ApiComfrioWS.model.Pedido;
import br.com.ApiComfrioWS.model.PedidoRowMapper;

@Repository
public class PedidoDAOImpl implements PedidoDAO {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Pedido> findpedidos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> findpedidobycod() {


		 return jdbcTemplate.query("SELECT pedido.codigo_pedido as codigo_pedido, \r\n" +
		 		" pedido.id as id_pedido,pedido_itens.id as id_item, \r\n" +
		 		" pedido_itens.codproduto as codproduto, \r\n" +
		 		" pedido_itens.descricaoproduto as descri_produto,\r\n" +
		 		" pedido_itens.qtdproduto as qtditem,\r\n" +
		 		" pedido_itens.unidadeproduto as unidade \r\n" +
		 		" \r\n" +
		 		" FROM tb_pedido pedido \r\n" +
		 		" JOIN tb_itens_pedido pedido_itens\r\n" +
		 		" on pedido.iten = pedido_itens.id\r\n" +
		 		" order by codigo_pedido", new PedidoRowMapper());

/*
		Pedido pedido = new Pedido();

		pedido.setBloqued(0);
		pedido.setId(1L);

		ItensPedido itens = new ItensPedido();
		itens.setCodproduto("789654");
		itens.setDescricaoproduto("BATATA");
		itens.setQtdproduto(23);
		itens.setUnidadeproduto("CX");

		ItensPedido itens1 = new ItensPedido();
		itens1.setCodproduto("123654");
		itens1.setDescricaoproduto("PÃO");
		itens1.setQtdproduto(10);
		itens1.setUnidadeproduto("UN");


		List<ItensPedido>lsitens = new ArrayList<>();
		lsitens.add(itens);
		lsitens.add(itens1);


		pedido.setItens(lsitens);
		// TODO Auto-generated method stub
		return pedido;
		*/
	}

}
