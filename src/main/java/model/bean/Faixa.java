package model.bean;



import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	LocalDateTime dataEntrega;
	
	public Faixa() {
		super();
	}

	public Faixa(CorFaixa cor, LocalDateTime dataEntrega) {
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
	public LocalDateTime getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDateTime dataEntrega) {
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
	
}
