package ar.com.escuela.pad.bean;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
	
@Entity
@Table(name = "localidad")
public class Localidad extends BaseBO{
		
	@ManyToOne
	@JoinColumn(name ="idProvincia")
	private Provincia provincia;
	
	private String codPostal;
	private String descLocalidad;
	
	public Localidad(){
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getDescLocalidad() {
		return descLocalidad;
	}

	public void setDescLocalidad(String descLocalidad) {
		this.descLocalidad = descLocalidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
}

