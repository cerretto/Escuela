package ar.com.escuela.pad.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.cur.bean.Alumno;
import ar.com.escuela.cur.bean.Docente;
import ar.com.escuela.seg.bean.Usuario;

@Entity
@Table(name="persona")
public class Persona extends BaseBO{

	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String nroDocumento;
	
	@Column
	private Date fechaNacimiento;
	
	@Column
	private String telefono;
	
	@OneToOne(mappedBy = "persona",fetch = FetchType.LAZY, optional = true)
	private Usuario usuario;
	
	@OneToOne(mappedBy = "persona",fetch = FetchType.LAZY, optional = true)
	private Alumno alumno;
	
	@OneToOne(mappedBy = "persona",fetch = FetchType.LAZY, optional = true)
	private Docente docente;
	
//	@OneToMany
//	private List<Domicilio> domicilios;
	
	@ManyToOne
	private Persona responsable;
	
//	@OneToMany
//	private List<Persona> hijos;
	
	
	
	
//	public List<Domicilio> getDomicilios() {
//		return domicilios;
//	}
//	public void setDomicilios(List<Domicilio> domicilios) {
//		this.domicilios = domicilios;
//	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Persona getResponsable() {
		return responsable;
	}
	public void setResponsable(Persona responsable) {
		this.responsable = responsable;
	}
//	public List<Persona> getHijos() {
//		return hijos;
//	}
//	public void setHijos(List<Persona> hijos) {
//		this.hijos = hijos;
//	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
