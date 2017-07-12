package ar.com.escuela.noti.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name="tipoaviso")
public class TipoAviso extends BaseBO{
	
	private String codTipoAviso;
	private String descTipoAviso;
	
	
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

}
