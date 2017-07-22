package ar.com.escuela.cur.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="notas")
public class Nota {

	private String calificacion;
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="idEvaluacion")
	private Evaluacion evaluacion;
	
	@ManyToOne
	@JoinColumn(name = "idAlumnoCurso")
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
