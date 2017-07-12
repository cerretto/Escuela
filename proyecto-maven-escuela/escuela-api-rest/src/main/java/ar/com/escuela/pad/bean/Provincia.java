package ar.com.escuela.pad.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name = "provincia")
public class Provincia extends BaseBO{

	private String descProvincia;
	
	public Provincia(){
	}

	public String getDescProvincia() {
		return descProvincia;
	}

	public void setDescProvincia(String descProvincia) {
		this.descProvincia = descProvincia;
	}
	
}
