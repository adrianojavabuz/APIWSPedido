package br.com.ApiComfrioWS.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

public class PedidoRowMapper implements RowMapper<Pedido>  {

	 public Pedido mapRow(ResultSet rs, int rowNum) throws SQLException {

		             Pedido pedido = new Pedido();
		             pedido.setId(rs.getLong("id_pedido"));
		             pedido.setCodigopedido(rs.getString("codigo_pedido"));


		             ItensPedido item = new ItensPedido();
		             item.setCodproduto(rs.getString("codproduto"));
		             item.setDescricaoproduto(rs.getString("descri_produto"));
		             item.setQtdproduto(rs.getInt("qtditem"));
		             item.setUnidadeproduto(rs.getString("unidade"));



		             pedido.setItem(item);


		             return pedido;

		         }




}
