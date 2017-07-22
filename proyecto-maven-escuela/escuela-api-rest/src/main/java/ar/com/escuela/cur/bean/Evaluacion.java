package ar.com.escuela.cur.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.def.bean.Materia;

@Entity
@Table(name="evaluaciones")
public class Evaluacion extends BaseBO{
	
	private String descEvaluacion;
	private Date fechaIni;
	private Date fechaFin;
	
	@ManyToOne
	@JoinColumn(name = "idMateria")
	private Materia materia;

	public String getDescEvaluacion() {
		return descEvaluacion;
	}

	public void setDescEvaluacion(String descEvaluacion) {
		this.descEvaluacion = descEvaluacion;
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

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
}
