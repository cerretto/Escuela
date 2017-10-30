package ar.com.escuela.def.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;

import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.cur.bean.Evaluacion;

@Entity
@Table(name="materia")
public class Materia  extends BaseBO{
	
	private String descripcion;
	private String horario;
	private String salon;
	
	@ManyToOne
	private Nivel nivel;
	
	public Materia(){
	}
	
	@OneToMany
	@JoinColumn(name ="idMateria")
	private List<Evaluacion> listEvaluaciones;

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

	public List<Evaluacion> getListEvaluaciones() {
		return listEvaluaciones;
	}

	public void setListEvaluaciones(List<Evaluacion> listEvaluaciones) {
		this.listEvaluaciones = listEvaluaciones;
	}
}
