package ar.com.escuela.def.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name="planes")
public class Plan  extends BaseBO{
	
	private String codPlan;
	private String descPlan;
	private String anio;
	
	@OneToMany
	@JoinColumn(name="idNivel")
	private List<Nivel> listNiveles;
	
	public Plan(){
	}
	
	public String getCodPlan() {
		return codPlan;
	}
	public void setCodPlan(String codPlan) {
		this.codPlan = codPlan;
	}
	public String getDescPlan() {
		return descPlan;
	}
	public void setDescPlan(String descPlan) {
		this.descPlan = descPlan;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public List<Nivel> getListNiveles() {
		return listNiveles;
	}
	public void setListNiveles(List<Nivel> listNiveles) {
		this.listNiveles = listNiveles;
	}
}
