package model.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "filiado")
public class Filiado {
	public static Long qtd = 0L;
	@Id
	@GeneratedValue
	@Column(name = "id")
	Long filiado_id;
	
	@Column
	String nome;
	
	@Column
	String registroCbj;
	
	@Column
	Date dataNascimento;
	
	@Column
	Date dataCadastro;
	
	@Column
	String telefone1;
	
	@Column
	String telefone2;
	
	@Column
	String email;

	@Column
	String cpf;

	@Column
	String observacoes;

	@OneToOne(cascade=CascadeType.ALL)
	Rg rg = new Rg();

	@OneToOne(cascade=CascadeType.ALL)
	Endereco endereco = new Endereco();
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Faixa> faixas = new ArrayList<Faixa>();
	
	public String toString(){
		String filiado = "Nome: "+nome+
						"\nRegistroCbj: "+registroCbj+
						"\nDataNasc: "+dataNascimento+
						"\nE-mail: "+email+
						"\nCPF: "+cpf;
		return filiado;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Filiado){
			Filiado other = (Filiado) obj;
			return 	filiado_id == other.filiado_id &&
					nome.equals(other.nome);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (int)(long) filiado_id;
	}
	
	public double getId() {
		return filiado_id;
	}
	public void setId(Long qtd2) {
		this.filiado_id = qtd2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegistroCbj() {
		return registroCbj;
	}
	public void setRegistroCbj(String registroCbj) {
		this.registroCbj = registroCbj;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Faixa> getFaixas() {
		return faixas;
	}
	public void setFaixas(List<Faixa> faixas) {
		this.faixas = faixas;
	}
	public Rg getRg() {
		return rg;
	}
	public void setRg(Rg rg) {
		this.rg = rg;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void copyProperties(Filiado f) {
		filiado_id = f.filiado_id;
		nome = f.nome;
		registroCbj = f.registroCbj;
		dataNascimento = f.dataNascimento;
		dataCadastro = f.dataCadastro;
		telefone1 = f.telefone1;
		telefone2 = f.telefone2;
		email = f.email;
		cpf = f.cpf;
		observacoes = f.observacoes;
	}

	public Filiado(Long filiado_id, String nome, String registroCbj, Date dataNascimento, Date dataCadastro,
			String telefone1, String telefone2, String email, String cpf, String observacoes, Rg rg, Endereco endereco,
			List<Faixa> faixas) {
		super();
		this.filiado_id = filiado_id;
		this.nome = nome;
		this.registroCbj = registroCbj;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
		this.cpf = cpf;
		this.observacoes = observacoes;
		this.rg = rg;
		this.endereco = endereco;
		this.faixas = faixas;
	}
	
	public Filiado() {}
}
