package ar.com.escuela.seg.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name = "rol")
public class Rol extends BaseBO {
	
	private String codigo;
	private String descripcion;
	
	@OneToMany
	private List<UsuarioRol> usuarioRoles;
	
	public Rol(){
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<UsuarioRol> getUsuarioRoles() {
		return usuarioRoles;
	}

	public void setUsuarioRoles(List<UsuarioRol> usuarioRoles) {
		this.usuarioRoles = usuarioRoles;
	}
	
}
