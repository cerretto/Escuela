package ar.com.escuela.pad.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name = "provincia")
public class Provincia extends BaseBO{

	private String descripcion;
	
	@OneToMany
	@JoinColumn(name = "idProvincia")
	private List<Localidad> listLocalidad;
	
	public List<Localidad> getListLocalidad() {
		return listLocalidad;
	}

	public void setListLocalidad(List<Localidad> listLocalidad) {
		this.listLocalidad = listLocalidad;
	}

	public Provincia(){
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
