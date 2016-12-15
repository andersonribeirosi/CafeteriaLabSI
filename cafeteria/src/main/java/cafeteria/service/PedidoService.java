package cafeteria.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cafeteria.dao.RepositorioPedidos;
import cafeteria.model.Pedido;

//@ApplicationException(rollback = true)
@Service
@Transactional
public class PedidoService {

	private final RepositorioPedidos repositorio;

	public PedidoService(RepositorioPedidos repositorio) {
		this.repositorio = repositorio;

	}

	public List<Pedido> findAll() {
		List<Pedido> pedidos = new ArrayList<>();
		for (Pedido pedido : repositorio.findAll()) {
			pedidos.add(pedido);

		}
		return pedidos;
	}

	public Pedido buscaPedido(int id_Produto){
		return repositorio.findOne(id_Produto);
		
	}
	
	
	public void save(Pedido pedido) {
		repositorio.save(pedido);

	}
	
	public void delete(int id_Produto){
		repositorio.delete(id_Produto);
		
	}
}
