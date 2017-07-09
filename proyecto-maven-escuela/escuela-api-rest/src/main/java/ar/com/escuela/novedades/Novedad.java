package ar.com.escuela.novedades;

import javax.persistence.Entity;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name = "NOVEDADES")
public class Novedad extends BaseBO{
	
	
	private String nombre;
	private String descripcion;
	
	public Novedad(){
		
	}
	
	public Novedad(String nombre, String descripcion) {
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
