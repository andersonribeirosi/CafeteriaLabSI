package cafeteria.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "categoria")
public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_Produto;
	private String nome;
	private String descricao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_pedido;
	private boolean finalizado;
	
	public Pedido(){}
	
	public Pedido(String nome, String descricao, Date data_pedido, boolean finalizado) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.data_pedido = data_pedido;
		this.finalizado = finalizado;
	}

	
	
	public int getId_Produto() {
		return id_Produto;
	}

	public void setId_Produto(int id_Produto) {
		this.id_Produto = id_Produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}

	public boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	@Override
	public String toString() {
		return "Pedido [id_Produto=" + id_Produto + ", nome=" + nome + ", descricao=" + descricao + ", data_pedido="
				+ data_pedido + ", finalizado=" + finalizado + "]";
	}

	
	
}
