package ar.com.escuela.def.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name="niveles")
public class Nivel extends BaseBO{
	
	private Long numero;
	private String descNivel;
	private Date fechaUltMdf;
	
	@OneToMany
	@JoinColumn(name="idCurso")
	private List<Curso> listCursos;
	
	@OneToMany
	@JoinColumn(name="idMateria")
	private List<Materia> listMaterias;
	
	@ManyToOne
	@JoinColumn(name="idPlan")
	private Plan plan;
	
	public Nivel(){
	}
	
	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getDescNivel() {
		return descNivel;
	}

	public void setDescNivel(String descNivel) {
		this.descNivel = descNivel;
	}

	public Date getFechaUltMdf() {
		return fechaUltMdf;
	}

	public void setFechaUltMdf(Date fechaUltMdf) {
		this.fechaUltMdf = fechaUltMdf;
	}

	public List<Curso> getListCursos() {
		return listCursos;
	}

	public void setListCurso(List<Curso> listCursos) {
		this.listCursos = listCursos;
	}

	public List<Materia> getListMaterias() {
		return listMaterias;
	}

	public void setListMaterias(List<Materia> listMaterias) {
		this.listMaterias = listMaterias;
	}

	public void setListCursos(List<Curso> listCursos) {
		this.listCursos = listCursos;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}
}
