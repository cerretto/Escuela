package ar.com.escuela.cur.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.def.bean.Materia;

@Entity
@Table(name="docenteMateria")
public class DocenteMateria extends BaseBO{
	
	@Column
	private Integer anio;
	
	@ManyToOne
	private Docente docente;
	
	@ManyToOne
	private Materia materia;
	
	
	
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	
}
