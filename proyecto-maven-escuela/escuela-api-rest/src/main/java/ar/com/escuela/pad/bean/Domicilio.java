package ar.com.escuela.pad.bean;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="domicilios")
public class Domicilio {
	
	private String calle;
	private String nroCalle;
	private String piso;
	private String dpto;
	
	@ManyToOne
	@JoinColumn(name="idPersona")
	private Persona Persona;
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNroCalle() {
		return nroCalle;
	}

	public void setNroCalle(String nroCalle) {
		this.nroCalle = nroCalle;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	public Persona getPersona() {
		return Persona;
	}

	public void setPersona(Persona persona) {
		Persona = persona;
	}
}
