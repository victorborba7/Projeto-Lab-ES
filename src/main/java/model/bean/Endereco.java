package model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
@NamedQuery(name = "enderecoRua", query = "SELECT e FROM Endereco e WHERE e.rua = :name")
public class Endereco {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	String rua;
	
	@Column
	String numero;
	
	@Column
	String bairro;
	
	@Column
	String cidade;
	
	@Column
	String estado;
	
	@Column
	String cep;
	
	@Override
	public String toString(){
		return "\nRua: "+rua+
				"\nNumero: "+numero+
				"\nBairro: "+bairro+
				"\nCidade: "+cidade+
				"\nEstado: "+estado+
				"\nCep: "+cep;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public void copyProperties(Endereco other){
		this.bairro = other.getBairro();
		this.cep = other.getCep();
		this.cidade = other.getCidade();
		this.estado = other.getEstado();
	}
	
}
