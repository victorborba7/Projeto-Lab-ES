package model.bean;

import java.util.Date;
import util.CorFaixa;

public class Faixa {
	CorFaixa cor;
	Date dataEntrega;
	
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
}
