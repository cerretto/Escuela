package ar.com.escuela.cur.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.def.bean.Curso;
import ar.com.escuela.seg.bean.Usuario;

@Entity
@Table(name="alumnoCurso")
public class AlumnoCurso extends BaseBO{

	@Column
	private Integer anio;
	
	@ManyToOne
	private Usuario alumno;
	
	@ManyToOne
	private Curso curso;

	@OneToMany
	private List<Nota> notas;
	
	
	
	public Integer getAnio() {
		return anio;
	}
	
	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	public Usuario getAlumno() {
		return alumno;
	}

	public void setAlumno(Usuario alumno) {
		this.alumno = alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
