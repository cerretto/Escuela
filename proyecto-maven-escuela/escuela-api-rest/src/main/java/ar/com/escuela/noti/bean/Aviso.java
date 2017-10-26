package ar.com.escuela.noti.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.seg.bean.Usuario;

@Entity
@Table(name = "avisos")
public class Aviso extends BaseBO{
	
	@Column(name="FECHAAVISO")
	private Date fechaAviso;
	
	@Column(name="DESCAVISO")
	private String descAviso;
	
	@ManyToOne
	@JoinColumn(name="IDTIPOAVISO")
	private TipoAviso tipoAviso;
	
	//Tengo al usuario que emite el aviso.
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario emisor; 
	
	//Tengo una lista de usuarios de un aviso en particular.
	@OneToMany
	@JoinColumn(name="idUsuario")
	private List<Usuario> listReceptores;
	
	public Aviso(){
	}
	
	public Date getFechaAviso() {
		return fechaAviso;
	}
	
	public void setFechaAviso(Date fechaAviso) {
		this.fechaAviso = fechaAviso;
	}
	
	public String getDescAviso() {
		return descAviso;
	}
	
	public void setDescAviso(String descAviso) {
		this.descAviso = descAviso;
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

	public List<Usuario> getListReceptores() {
		return listReceptores;
	}

	public void setListUsuarios(List<Usuario> listReceptores) {
		this.listReceptores = listReceptores;
	}
}
