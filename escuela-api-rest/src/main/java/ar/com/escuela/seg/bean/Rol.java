package ar.com.escuela.seg.bean;

import ar.com.escuela.base.bean.BaseBO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "rol")
public class Rol extends BaseBO {
	
	@Column
	private String codigo;
	
	@Column
	private String descripcion;

	@JsonIgnore
	@OneToMany(mappedBy = "rol",fetch = FetchType.LAZY)
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
