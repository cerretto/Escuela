package ar.com.escuela.noti.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.seg.bean.Usuario;

@Entity
@Table(name = "aviso")
public class Aviso extends BaseBO{
	
	@Column
	private Date fecha;
	
	@Column
	private String descripcion;
	
	@ManyToOne
	private TipoAviso tipoAviso;
	
	//Tengo al usuario que emite el aviso.
	@ManyToOne
	private Usuario emisor; 
	
	//Tengo una lista de usuarios de un aviso en particular.
	@OneToMany
	private List<Usuario> receptores;
	
	public Aviso(){
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoAviso getTipoAviso() {
		return tipoAviso;
	}

	public void setTipoAviso(TipoAviso tipoAviso) {
		this.tipoAviso = tipoAviso;
	}

	public Usuario getEmisor() {
		return emisor;
	}

	public void setEmisor(Usuario emisor) {
		this.emisor = emisor;
	}

	public List<Usuario> getReceptores() {
		return receptores;
	}

	public void setReceptores(List<Usuario> receptores) {
		this.receptores = receptores;
	}
}
