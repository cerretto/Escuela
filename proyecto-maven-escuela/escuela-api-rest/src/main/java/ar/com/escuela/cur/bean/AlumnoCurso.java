package ar.com.escuela.cur.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.def.bean.Curso;

@Entity
@Table(name="alumnoCurso")
public class AlumnoCurso extends BaseBO{

	@Column
	private Integer anio;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alumno_id")
	private Alumno alumno;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
	private Curso curso;
	
	@Column
	private Date fechaInscripcion;

	public Integer getAnio() {
		return anio;
	}
	
	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}

	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	
}
