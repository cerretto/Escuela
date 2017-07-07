package ar.com.escuela.seg.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import ar.com.escuela.base.bean.BaseEntity;

@Entity
@Table(name = "usuarios")
public class Usuario extends BaseEntity{
	
	
	private String nombre;
	private String apellido;
	
	public Usuario(){
		
	}
	
	public Usuario(int id, String nombre, String descripcion) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setApellido(descripcion);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}


