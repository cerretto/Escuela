package ar.com.escuela.def.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.cur.bean.AlumnoCurso;

@Entity
@Table(name="curso")
public class Curso extends BaseBO{
	
	@Column
	private String codigo;
	
	@Column
	private String decripcion;
	
	@Column
	private Long cupo;
	
	@Column
	private Long anioCalendario;
	
	@ManyToOne
	private Nivel nivel;
	
	public Curso(){
	}
	
	@OneToMany
	@JoinColumn(name="idCurso")
	private List<AlumnoCurso> listAlumnoCurso;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigp) {
		this.codigo = codigp;
	}
	public String getDescripcion() {
		return decripcion;
	}
	public void setDescripcion(String descripcion) {
		this.decripcion = descripcion;
	}
	public Long getCupo() {
		return cupo;
	}
	public void setCupo(Long cupo) {
		this.cupo = cupo;
	}
	public Long getAnioCalendario() {
		return anioCalendario;
	}
	public void setAnioCalendario(Long anioCalendario) {
		this.anioCalendario = anioCalendario;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
}
