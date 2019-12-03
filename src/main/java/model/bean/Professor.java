package model.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="professor")
@NamedQueries(value = { 
		@NamedQuery(name = "listProfessor", query = "SELECT p FROM Professor p"),
		@NamedQuery(name = "professorName", query = "SELECT p FROM Professor p WHERE p.filiado.nome LIKE :nome")
		})
public class Professor {
	
	@Id
	@GeneratedValue
	Long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	Filiado filiado;
	
	@ManyToMany(cascade=CascadeType.ALL)
	List<Entidade> entidades = new ArrayList<>();


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
		return 29 * hash +(this.filiado.getId() != 0 ? (int)(long)this.filiado.getId() : 0);
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
	
	public void copyProperties(Professor professor) {
		filiado = professor.filiado;
		entidades = professor.entidades;
	}
}
