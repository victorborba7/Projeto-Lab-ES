package model.bean;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	Filiado filiado = new Filiado();
	List<Entidade> entidades = new ArrayList<Entidade>();
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Professor){
			Professor other = (Professor) obj;
			return 	filiado.filiado_id == other.filiado.filiado_id;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		return 29 * hash +(this.filiado.getId() != null ? (int)(long)this.filiado.getId() : 0);
	}

	public Filiado getFiliado() {
		return filiado;
	}

	public void setFiliado(Filiado filiado) {
		this.filiado = filiado;
	}
	
	public List<Entidade> getEntidades() {
		return entidades;
	}
	
	public void setEntidades(List<Entidade> entidades) {
		this.entidades = entidades;
	}
	
	public String toString(){
		return this.filiado.getNome();
	}
}
