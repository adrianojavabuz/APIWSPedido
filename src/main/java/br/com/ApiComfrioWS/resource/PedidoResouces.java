package br.com.ApiComfrioWS.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ApiComfrioWS.business.PedidoBusiness;
import br.com.ApiComfrioWS.dao.PedidoDAO;
import br.com.ApiComfrioWS.dao.PedidoDAOImpl;
import br.com.ApiComfrioWS.model.Pedido;



@RestController
public class PedidoResouces {

	@Autowired
	PedidoBusiness  pedidoBusiness;
/*
	 @RequestMapping(value = "/pedidos", method = RequestMethod.GET)
	  public ResponseEntity<List<Pedido>> listar() {
	    return new ResponseEntity<List<Pedido>>(new ArrayList<Pedido>(pedidoDAO.findpedidobycod()), HttpStatus.OK);
	  }
	  */
	@Cacheable("pedidos")
	@GetMapping(value = "/pedidos/{id}")
	 public  ResponseEntity<Pedido> buscar(@PathVariable("id") Integer id) {
		 //Pedido pedido = cursos.get(id);

		 // if (curso == null) {
		    //return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 // }

		  return new ResponseEntity<Pedido>(pedidoBusiness.findpedido(), HttpStatus.OK);
		}

}
