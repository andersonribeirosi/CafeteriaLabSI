package cafeteria.dao;

import org.springframework.data.repository.CrudRepository;

import cafeteria.model.Pedido;

public interface RepositorioPedidos extends CrudRepository<Pedido, Integer> {

}
