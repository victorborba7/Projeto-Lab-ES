package model.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import util.CorFaixa;

@Entity
@Table(name = "faixa")
public class Faixa {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	CorFaixa cor;
	
	@Column
	Date dataEntrega;
	
	@ManyToOne
	@JoinColumn(name="filiado_id")
	private Filiado filiado;
	
	public Faixa() {
		super();
	}

	public Faixa(CorFaixa cor, Date dataEntrega) {
		super();
		this.cor = cor;
		this.dataEntrega = dataEntrega;
	}

	public CorFaixa getCor() {
		return cor;
	}
	
	public void setCor(CorFaixa cor) {
		this.cor = cor;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	@Override
	public String toString(){
		return this.cor + " - "+ this.dataEntrega;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Filiado getFiliado() {
		return filiado;
	}

	public void setFiliado(Filiado filiado) {
		this.filiado = filiado;
	}
	
}
