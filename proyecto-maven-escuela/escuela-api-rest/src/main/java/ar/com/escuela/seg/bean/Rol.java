package ar.com.escuela.seg.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name = "roles")
public class Rol extends BaseBO {
	
	private String codRol;
	private String desRol;
	
	@OneToMany
	@JoinColumn(name = "idRol")
	private List<UsuarioRol> listUsuarioRol;
	
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

	public List<UsuarioRol> getListUsuarioRol() {
		return listUsuarioRol;
	}

	public void setListUsuarioRol(List<UsuarioRol> listUsuarioRol) {
		this.listUsuarioRol = listUsuarioRol;
	}
	
}
