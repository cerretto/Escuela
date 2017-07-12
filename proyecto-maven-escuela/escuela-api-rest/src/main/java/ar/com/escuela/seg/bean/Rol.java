package ar.com.escuela.seg.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name = "roles")
public class Rol extends BaseBO {
	
	private String codRol;
	private String desRol;
	
	public Rol(){
		
	}

	public String getCodRol() {
		return codRol;
	}

	public void setCodRol(String codRol) {
		this.codRol = codRol;
	}

	public String getDesRol() {
		return desRol;
	}

	public void setDesRol(String desRol) {
		this.desRol = desRol;
	}
	
}
