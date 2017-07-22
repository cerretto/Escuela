package ar.com.escuela.noti.bean;

import java.util.Date;
import java.util.List;

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
	
	private Date fechaAviso;
	private String descAviso;
	
	@ManyToOne
	@JoinColumn(name="idTipoAviso")
	private TipoAviso tipoAviso;
	
	//Tengo al usuario que emite el aviso.
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario; 
	
	//Tengo una lista de usuarios de un aviso en particular.
	@OneToMany
	@JoinColumn(name="idUsuario")
	private List<Usuario> listUsuarios;
	
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListUsuarios() {
		return listUsuarios;
	}

	public void setListUsuarios(List<Usuario> listUsuarios) {
		this.listUsuarios = listUsuarios;
	}
}
