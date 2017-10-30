package ar.com.escuela.def.bean;

import java.util.Date;
import java.util.List;

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
	
	private String codigo;
	private String decripcion;
	private Long cupo;
	private Date anioCalendario;
	
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
	public Date getAnioCalendario() {
		return anioCalendario;
	}
	public void setAnioCalendario(Date anioCalendario) {
		this.anioCalendario = anioCalendario;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
}
