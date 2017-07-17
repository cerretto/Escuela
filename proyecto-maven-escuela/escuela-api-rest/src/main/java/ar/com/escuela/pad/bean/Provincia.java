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

	private String descProvincia;
	
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

	public String getDescProvincia() {
		return descProvincia;
	}

	public void setDescProvincia(String descProvincia) {
		this.descProvincia = descProvincia;
	}
	
}
