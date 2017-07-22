package ar.com.escuela.cur.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.def.bean.Materia;
import ar.com.escuela.seg.bean.Usuario;

@Entity
@Table(name="docenteMateria")
public class DocenteMateria extends BaseBO{
	
	
	private Date fechaIni;
	private Date fechaFin;
	
	@ManyToOne
	@JoinColumn(name="idDocente")
	private Usuario docente;
	
	@ManyToOne
	@JoinColumn(name="idMateria")
	private Materia materia;
	
	
	
	public Usuario getDocente() {
		return docente;
	}
	public void setDocente(Usuario docente) {
		this.docente = docente;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
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
	
}
