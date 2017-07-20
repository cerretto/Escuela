package ar.com.escuela.def.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name="comisiones")
public class Comision extends BaseBO{
	
	private String codComision;
	private String desComision;
	private Long cupo;
	
	public String getCodComision() {
		return codComision;
	}
	public void setCodComision(String codComision) {
		this.codComision = codComision;
	}
	public String getDesComision() {
		return desComision;
	}
	public void setDesComision(String desComision) {
		this.desComision = desComision;
	}
	public Long getCupo() {
		return cupo;
	}
	public void setCupo(Long cupo) {
		this.cupo = cupo;
	}
}
