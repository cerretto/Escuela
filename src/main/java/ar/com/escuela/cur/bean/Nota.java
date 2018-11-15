package ar.com.escuela.cur.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name="nota")
public class Nota extends BaseBO{

	@Column
	private String calificacion;
	
	@Column
	private Date fecha;
	
	@ManyToOne
	private Evaluacion evaluacion;
	
	@ManyToOne
	@JoinColumn(name = "alumno_curso_id")
	private AlumnoCurso alumnoCurso;
	
	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Evaluacion getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}

	public AlumnoCurso getAlumnoCurso() {
		return alumnoCurso;
	}

	public void setAlumnoCurso(AlumnoCurso alumnoCurso) {
		this.alumnoCurso = alumnoCurso;
	}
	
	
}
