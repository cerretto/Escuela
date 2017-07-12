package ar.com.escuela.seg.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name = "usuarios")
public class Usuario extends BaseBO{
	
	
	private String usr;
	private String password;
	private Date fechaInscripcion;
	
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
	
}


