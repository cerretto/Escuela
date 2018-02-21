package ar.com.escuela.cur.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.def.bean.Materia;

@Entity
@Table(name="evaluacion")
public class Evaluacion extends BaseBO{
	
	@Column
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id")
	private Materia materia;
	
//	@OneToMany
//	private List<Nota> notas;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

//	public List<Nota> getNotas() {
//		return notas;
//	}
//
//	public void setNotas(List<Nota> notas) {
//		this.notas = notas;
//	}
}
