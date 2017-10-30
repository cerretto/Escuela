package ar.com.escuela.def.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name="plan")
public class Plan  extends BaseBO{
	
	private String codigo;
	private String descripcion;
	private String anio;
	
	@OneToMany
	@JoinColumn(name="idNivel")
	private List<Nivel> listNiveles;
	
	public Plan(){
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
