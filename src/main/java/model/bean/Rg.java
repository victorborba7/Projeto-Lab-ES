package model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rg")
public class Rg {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	String numero;
	
	@Column
	String orgaoExpedidor;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "filiado_id")
	private Filiado filiado;
	
	public Rg() {}
	
	public Rg(String numero, String orgaoExpedidor) {
		this.numero = numero;
		this.orgaoExpedidor = orgaoExpedidor;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rg){
			Rg other = (Rg) obj;
			return 	numero.equals(other.numero)&&
					orgaoExpedidor.equals(other.orgaoExpedidor);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return (int)(long) numero.hashCode()+orgaoExpedidor.hashCode();
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
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
