package model.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
@NamedQueries(value = {
		@NamedQuery(name = "listAluno", query = "SELECT a FROM Aluno a"),
		@NamedQuery(name = "alunoName", query = "SELECT a FROM Aluno a WHERE a.filiado.nome = :name")
})
public class Aluno {
	
	@Id
	@GeneratedValue
	private Long aluno_id;
	
	@OneToOne(cascade=CascadeType.ALL)
	Filiado filiado;
	
	@OneToOne(cascade=CascadeType.ALL)
	Entidade entidade;
	
	@OneToOne(cascade=CascadeType.ALL)
	Professor professor;
	
	public Filiado getFiliado() {
		return filiado;
	}
	public void setFiliado(Filiado filiado) {
		this.filiado = filiado;
	}
	public Entidade getEntidade() {
		return entidade;
	}
	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String toString(){
		return filiado.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Aluno){
			Aluno other = (Aluno) obj;
			return 	filiado.filiado_id == other.filiado.filiado_id &&
			filiado.nome.equals(other.filiado.nome);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		return 29 * hash +(this.filiado.getId() != 0 ? (int)(long)this.filiado.getId() : 0);
	}
	
	public void copyProperties(Aluno other){
		this.filiado.copyProperties(other.getFiliado());
		this.entidade = other.getEntidade();
		this.professor = other.getProfessor();
	}
}