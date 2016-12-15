drop table produtos;

create table produtos(
	id_Produto serial,
  nome character varying(50),
  descricao character varying(100),
  data_pedido Date,
  finalizado varchar(10),
  Constraint pk_id_Produto Primary key (id_Produto)
  );

  INSERT INTO produtos(nome, descricao, data_pedido, finalizado) VALUES ('Anderson Ribeiro', 'Café expresso', current_timestamp, 'false');

  select * from produtos