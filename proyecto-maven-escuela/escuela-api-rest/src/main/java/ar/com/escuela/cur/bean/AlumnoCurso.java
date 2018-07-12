package ar.com.escuela.cur.bean;

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

//	@OneToMany
//	private List<Nota> notas;
	
	
	
	public Integer getAnio() {
		return anio;
	}
	
	public void setAnio(Integer anio) {
		this.anio = anio;
	}

//	public List<Nota> getNotas() {
//		return notas;
//	}
//
//	public void setNotas(List<Nota> notas) {
//		this.notas = notas;
//	}

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
	
}
