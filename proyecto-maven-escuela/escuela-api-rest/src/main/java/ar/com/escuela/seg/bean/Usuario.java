package ar.com.escuela.seg.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.pad.bean.Persona;

@Entity
@Table(name = "usuarios")
public class Usuario extends BaseBO{
	
	private String usr;
	private String password;
	private Date fechaInscripcion;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<UsuarioRol> listUsuarioRol;
	
	@OneToOne
	@JoinColumn(name = "idPersona")
	private Persona persona;
	
	public Usuario(){
	}
	
	public String getUsr() {
		return usr;
	}
	public void setUsr(String usr) {
		this.usr = usr;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UsuarioRol> getListUsuarioRol() {
		return listUsuarioRol;
	}

	public void setListUsuarioRol(List<UsuarioRol> listUsuarioRol) {
		this.listUsuarioRol = listUsuarioRol;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}


}


