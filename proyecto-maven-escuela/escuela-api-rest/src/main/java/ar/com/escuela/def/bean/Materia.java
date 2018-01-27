package ar.com.escuela.def.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name="materia")
public class Materia  extends BaseBO{
	
	@Column
	private String descripcion;
	
	@Column
	private String horario;
	
	@Column
	private String salon;
	
	@ManyToOne
	private Nivel nivel;
	
//	@OneToMany
//	private List<Evaluacion> evaluciones;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

//	public List<Evaluacion> getEvaluaciones() {
//		return evaluciones;
//	}
//
//	public void setEvaluaciones(List<Evaluacion> evaluaciones) {
//		this.evaluciones = evaluaciones;
//	}
}
