package ar.com.escuela.novedades;

import javax.persistence.Entity;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseEntity;

@Entity
@Table(name = "novedades")
public class Novedad extends BaseEntity{
	
	
	private String nombre;
	private String descripcion;
	
	public Novedad(){
		
	}
	
	public Novedad(int id, String nombre, String descripcion) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
