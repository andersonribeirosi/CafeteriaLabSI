package cafeteria.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cafeteria.model.Pedido;
import cafeteria.service.PedidoService;

@Controller
public class MainController {

	@Autowired
	private PedidoService pedidoService;
	
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		
		return "index";

	}

	@GetMapping("/todos-pedidos")
	public String todosPedidos(HttpServletRequest request) {
		request.setAttribute("categoria", pedidoService.findAll());
		request.setAttribute("mode", "MODE_PEDIDOS");
		return "index";

	}
	
	@GetMapping("/novos-pedidos")
	public String novosPedidos(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_NOVO");
		return "index";

	}
	
	
	@PostMapping("/save-pedidos")
	public String salvarPedidos(@ModelAttribute Pedido pedido,
			BindingResult br, HttpServletRequest request) {
		pedido.setData_pedido(new Date());
		pedidoService.save(pedido);
		request.setAttribute("categoria", pedidoService.findAll());
		request.setAttribute("mode", "MODE_PEDIDOS");
		return "index";
	}
	
	
	
	
	@GetMapping("/update-pedidos")
	public String updatePedidos(@RequestParam int id_Produto, javax.servlet.http.HttpServletRequest request) {
		request.setAttribute("categoria", pedidoService.buscaPedido(id_Produto));
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";

	}
	
	@GetMapping("/delete-pedidos")
	public String deletePedidos(@RequestParam int id_Produto,  javax.servlet.http.HttpServletRequest request) {
		pedidoService.delete(id_Produto);
		request.setAttribute("categoria", pedidoService.findAll());
		request.setAttribute("mode", "MODE_DELETE");
		return "index";

	}
}
