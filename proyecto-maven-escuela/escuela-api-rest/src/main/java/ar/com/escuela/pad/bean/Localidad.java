package ar.com.escuela.pad.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
	
@Entity
@Table(name = "localidad")
public class Localidad extends BaseBO{
		
	@ManyToOne
	private Provincia provincia;
	
	@OneToMany
	private List<Domicilio> domicilios;
	
	private String codPostal;
	private String descripcion;
	
	public Localidad(){
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Domicilio> getDomicilios() {
		return domicilios;
	}

	public void setDomicilios(List<Domicilio> domicilios) {
		this.domicilios = domicilios;
	}
	
}

