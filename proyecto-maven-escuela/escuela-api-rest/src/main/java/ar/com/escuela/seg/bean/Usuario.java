package ar.com.escuela.seg.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.pad.bean.Persona;

@Entity
@Table(name = "usuario")
public class Usuario extends BaseBO{
	
	@Column
	private String usr;
	
	@Column
	private String password;
	
	@Column
	private Date fechaInscripcion;
	
	@OneToMany(mappedBy = "usuario",fetch = FetchType.EAGER)
	private List<UsuarioRol> usuarioRoles;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id")
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

	public List<UsuarioRol> getUsuarioRoles() {
		return usuarioRoles;
	}

	public void setUsuarioRoles(List<UsuarioRol> usuarioRoles) {
		this.usuarioRoles = usuarioRoles;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}



}


