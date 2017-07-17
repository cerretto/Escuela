package ar.com.escuela.noti.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name="tipoaviso")
public class TipoAviso extends BaseBO{
	
	private String codTipoAviso;
	private String descTipoAviso;
	
	@OneToMany
	@JoinColumn(name = "idTipoAviso")
	private List<Aviso> listAviso;
	
	
	public String getCodTipoAviso() {
		return codTipoAviso;
	}
	public void setCodTipoAviso(String codTipoAviso) {
		this.codTipoAviso = codTipoAviso;
	}
	public String getDescTipoAviso() {
		return descTipoAviso;
	}
	public void setDescTipoAviso(String descTipoAviso) {
		this.descTipoAviso = descTipoAviso;
	}
	public List<Aviso> getListAviso() {
		return listAviso;
	}
	public void setListAviso(List<Aviso> listAviso) {
		this.listAviso = listAviso;
	}

}
