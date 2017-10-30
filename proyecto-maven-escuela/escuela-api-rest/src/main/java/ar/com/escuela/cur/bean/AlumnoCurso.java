package ar.com.escuela.cur.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.def.bean.Curso;
import ar.com.escuela.seg.bean.Usuario;

@Entity
@Table(name="alumnoCurso")
public class AlumnoCurso extends BaseBO{

	private Date fechaIni;
	private Date fechaFin;
	
	@ManyToOne
	private Usuario alumno;
	
	@ManyToOne
	private Curso curso;

	@OneToMany
	@JoinColumn(name = "idAlumnoCurso")
	private List<Nota> listNotas;
	
	
	
	
	public List<Nota> getListNotas() {
		return listNotas;
	}

	public void setListNotas(List<Nota> listNotas) {
		this.listNotas = listNotas;
	}

	public Date getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
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
