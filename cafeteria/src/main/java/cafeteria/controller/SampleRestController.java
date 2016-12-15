package cafeteria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController{

	@Autowired
//	private PedidoService pedidoService;
	

	@GetMapping("/hello")
	public String hello() {
		return "Hello Anderson AÊÊ";

	}

//	@GetMapping("/todos-pedidos")
//	public String todosPedidos() {
//		return pedidoService.findAll().toString();
//
//	}
//	
//	@GetMapping("/pedidos-salvo")
//	public String savePedido(@RequestParam(value = "nome", required = false) String nome,
//			@RequestParam(value = "descricao", required = false) String desc,
//			@RequestParam(value = "data_pedido", required = false) Date data_pedido,
//			@RequestParam(value = "finalizado", required = false) boolean finalizado) {
//
//		Pedido pedido = new Pedido(nome, desc, data_pedido, finalizado);
//		pedidoService.save(pedido);
//		return "Pedido Salvo";
//
//	}
//	
//	@GetMapping("/pedidos-deletados")
//	public String deletarPedido(@RequestParam (value = "id_Produto", required = false)
//	Integer id_Produto){		
//		pedidoService.delete(id_Produto);
//		return "Pedido deletado";
//
//	}


}
