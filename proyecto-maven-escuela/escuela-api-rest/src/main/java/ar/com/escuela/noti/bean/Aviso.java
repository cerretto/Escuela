package ar.com.escuela.noti.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name = "avisos")
public class Aviso extends BaseBO{
	
	@ManyToOne
	@JoinColumn(name ="idTipoAviso")
	private TipoAviso tipoAviso;
	
	private Date fechaAviso;
	private String descAviso;
	
	public Aviso(){
		
	}
	
	
	public Date getFechaAviso() {
		return fechaAviso;
	}
	
	public void setCodAviso(Date fechaAviso) {
		this.fechaAviso = fechaAviso;
	}
	
	public String getDescripcion() {
		return descAviso;
	}
	
	public void setDescripcion(String descAviso) {
		this.descAviso = descAviso;
	}

	public TipoAviso getTipoAviso() {
		return tipoAviso;
	}

	public void setTipoAviso(TipoAviso tipoAviso) {
		this.tipoAviso = tipoAviso;
	}
	
}
