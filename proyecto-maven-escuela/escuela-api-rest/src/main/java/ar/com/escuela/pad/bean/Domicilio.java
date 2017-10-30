package ar.com.escuela.pad.bean;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name="domicilio")
public class Domicilio extends BaseBO{
	
	private String calle;
	private String nroCalle;
	private String piso;
	private String dpto;
	
	@ManyToOne
	private Persona Persona;
	
	@ManyToOne
	private Localidad localidad;
	
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

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
}
