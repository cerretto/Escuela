package ar.com.escuela.seg.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.noti.bean.Aviso;

@Entity
@Table(name = "usuarios")
public class Usuario extends BaseBO{
	
	private String usr;
	private String password;
	private Date fechaInscripcion;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<UsuarioRol> listUsuarioRol;
	
	//En este caso tengo el aviso emitido por el usario. EMISOR
	@ManyToOne
	@JoinColumn(name="idAviso")
	private Aviso aviso; 
	
	//En este caso tengo una lista de avisos para un usuario. RECEPTOR
	@OneToMany
	@JoinColumn(name="idAviso")
	private List<Aviso> listAvisos;
	
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

	public Aviso getAviso() {
		return aviso;
	}

	public void setAviso(Aviso aviso) {
		this.aviso = aviso;
	}

	public List<Aviso> getListAvisos() {
		return listAvisos;
	}

	public void setListAvisos(List<Aviso> listAvisos) {
		this.listAvisos = listAvisos;
	}
}


